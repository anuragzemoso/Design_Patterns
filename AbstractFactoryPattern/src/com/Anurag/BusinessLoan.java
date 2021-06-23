package com.Anurag;

public class BusinessLoan extends Loan {
    public BusinessLoan(){
        setInterestRate();
    }
    @Override
    public void setInterestRate() {
        rate = 9;
    }
}
