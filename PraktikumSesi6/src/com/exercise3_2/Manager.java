package com.exercise3_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Kelas Manager adalah turunan dari kelas Employee dan mengimplementasikan interface Sortable.
 * Kelas ini merepresentasikan seorang manajer dengan tambahan informasi nama sekretaris.
 * Manager memiliki kemampuan untuk membandingkan gaji dengan objek Employee lain.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

interface Sortable {

    int compare(Sortable b);
}

public class Manager extends Employee implements Sortable {

    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return this.secretaryName;
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (super.getSalary() < eb.getSalary()) {
            return -1;
        }
        if (super.getSalary() > eb.getSalary()) {
            return 1;
        }
        return 0;
    }

}
