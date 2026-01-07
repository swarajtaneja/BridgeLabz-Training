package com.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 0.008); // 0.8% monthly
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 700 &&
                         applicant.getIncome() >= 50000;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        // Home loans offer discounted EMI
        return emiFormula(applicant.getLoanAmount(), interestRate - 0.001, term);
    }
}
