package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; // in months
    protected double interestRate;
    private boolean approved;  // status cannot be modified externally

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    // Common EMI formula
    protected double emiFormula(double principal, double rate, int months) {
        return (principal * rate * Math.pow(1 + rate, months)) /
                (Math.pow(1 + rate, months) - 1);
    }
}
