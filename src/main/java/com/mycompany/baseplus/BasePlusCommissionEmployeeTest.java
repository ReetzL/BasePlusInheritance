/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseplus;

/**
 *
 * @author behlt
 */
// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

// Question 9.3
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        //9.15 question
        HourlyEmployee employee = new HourlyEmployee("Reetz", "Limonta", "123-45-6789", 20.0, 40.0);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s%n%s: $%,.2f%n%s: %.2f%n%s: $%,.2f%n",
                employee.getFirstName() + " " + employee.getLastName(),
                "hourly wage", employee.getWage(),
                "hours worked", employee.getHours(),
                "earnings", employee.earnings());

        employee.setWage(25.0);
        employee.setHours(50.0);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information", employee.toString());
    }
}

//9.3 test
       /**
       BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
   "Eren", "Yeager", "133-50-8888", 5000, 0.04, 300);
   
System.out.println(employee.toString());
System.out.printf("Earnings: $%.2f%n", employee.earnings());

employee.setBaseSalary(1000);

System.out.println(employee.toString());
System.out.printf("Earnings: $%.2f%n", employee.earnings());

   }   
}   
**/
      
    /**
    // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee =             
         new BasePlusCommissionEmployee(                
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:%n");
      System.out.printf("%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee.toString());
   } 
} 
**/
