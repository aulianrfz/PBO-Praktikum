package com.kasus1;

public class Employee extends StaffMember {

    protected String socialsecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialsecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "inSocial Security Number: " + socialsecurityNumber;
        
        return result ;
    }
    
    @Override
    public double pay() {
        return payRate;
    }
}
