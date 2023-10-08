package com.exercise3_2;

/**
 * Kelas EmployeeTest adalah kelas yang digunakan untuk menguji fungsionalitas kelas Manager.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class ManagerTest {

    public static void main(String[] args) {
        Manager[] staff = new Manager[3];
        staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }
        
        int comparisonResult = staff[0].compare(staff[1]);
        System.out.println("Comparison result: " + comparisonResult);
    }
   
}

