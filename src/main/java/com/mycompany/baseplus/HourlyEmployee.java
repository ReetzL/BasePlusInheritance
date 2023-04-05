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
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (hours <= 40.0) {
            return wage * hours;
        } else {
            return 40.0 * wage + (hours - 40.0) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %.2f",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
