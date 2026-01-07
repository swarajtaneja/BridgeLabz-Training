package com.loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 0.015); // 1.5% monthly
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 650 &&
                         applicant.getIncome() >= 30000;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(applicant.getLoanAmount(), interestRate, term);
    }
}
 	