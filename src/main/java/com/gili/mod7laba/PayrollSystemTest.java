// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
package com.gili.mod7laba;
public class PayrollSystemTest {
    public static void main(String[] args) {
        Date date = new Date(4, 24, 2023);
        Employee[] employees = new Employee[3];

        employees[0] = new HourlyEmployee("John", "Smith", "123-45-6789", 15, 40,1, 1, 2000);
        employees[1] = new HourlyEmployee("Brittany", "Morgan", "987-65-4321", 20, 32, 2, 2, 2001);
        employees[2] = new HourlyEmployee("Mary", "Smith", "543-21-9876",17, 10, 4, 3, 2002);

        
        for (Employee employee : employees) {
            double earnings = employee.earnings();
            if (employee.getBirthDate().getMonth() == date.getMonth()) {
                earnings += 100.00;
            }
            System.out.println("Payroll for " + employee.getFirstName() + " " + employee.getLastName() + ": $" + earnings);
        }
    }
}