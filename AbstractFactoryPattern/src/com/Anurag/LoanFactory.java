package com.Anurag;

public class LoanFactory implements AbstractFactory{

    @Override
    public Loan getItem(String loanType) {
        if(loanType == null){
            return null;
        }
        if(loanType.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loanType.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        } else if(loanType.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}