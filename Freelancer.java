import java.util.Random;

/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */

public class Freelancer extends Employee{

    
    private Random randomHoursAndSalary = new Random();
    public int hoursPerWeek = randomHoursAndSalary.nextInt(20,30);
    public double salaryPerHour = randomHoursAndSalary.nextInt(500, 2000);

    public Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return this.salaryPerHour*this.hoursPerWeek;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Зарплата (за отработанные часы): %.2f (руб.)",
                surName, name, calculateSalary());
    }
}
