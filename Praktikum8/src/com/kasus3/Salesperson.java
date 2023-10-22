package com.kasus3;

public class Salesperson implements Comparable {

    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    @Override
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        int result = this.totalSales - ((Salesperson) other).totalSales;
        if (result == 0) {
            result = this.lastName.compareTo(((Salesperson) other).lastName);
            if (result == 0) {
                result = this.firstName.compareTo(((Salesperson) other).firstName);
            }
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getsales() {
        return totalSales;
    }
}
