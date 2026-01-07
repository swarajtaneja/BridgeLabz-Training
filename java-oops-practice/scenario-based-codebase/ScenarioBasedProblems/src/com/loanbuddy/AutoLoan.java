package com.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 0.012); // 1.2% monthly
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 600;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(applicant.getLoanAmount(), interestRate, term);
    }
}
