package com.Anurag;

public class HomeLoan extends Loan{
    public HomeLoan(){
        setInterestRate();
    }
    @Override
    public void setInterestRate(){
        rate=6;
    }
}
