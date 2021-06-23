package com.Anurag;

public class EducationLoan extends Loan {
    public EducationLoan(){
        setInterestRate();
    }
    @Override
    public void setInterestRate() {
        rate = 7;
    }
}
