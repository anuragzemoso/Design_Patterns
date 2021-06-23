package com.Anurag;

import java.io.*;
public class AbstractFactoryPattern {
    public void test()throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName=br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=br.readLine();
        AbstractFactory<Bank> bankFactory = FactoryCreator.getFactory("Bank");
        Bank b= bankFactory.getItem(bankName);

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("You are taking the loan from "+ b.getBankName());

        AbstractFactory<Loan> loanFactory = FactoryCreator.getFactory("Loan");
        Loan l= loanFactory.getItem(loanName);
        l.calculateLoanPayment(loanAmount,years);
    }
}
