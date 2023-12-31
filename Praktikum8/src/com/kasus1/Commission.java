package com.kasus1;

public class Commission extends Hourly {
    
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, 
            String socSecNumber, double rate, double commissionRate) 
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay() {
        double hourlyPayment = super.pay();
        double commissionPayment = totalSales * commissionRate;
        totalSales = 0.0;
        return hourlyPayment + commissionPayment;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales + "\nCommission Rate: " 
                + (commissionRate * 100) + "%";
        return result;
    }
    
}

