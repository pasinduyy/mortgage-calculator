package io.github.pasinduyy;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
    }

    public void displayMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println();
        System.out.println("----- MORTGAGE -----");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void displayPaymentSchedule() {
        System.out.println();
        System.out.println("----- PAYMENT SCHEDULE -----");
        for (double balance : mortgageCalculator.getRemainingBalances()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
