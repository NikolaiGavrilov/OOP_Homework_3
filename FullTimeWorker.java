import java.util.Random;

/**
 * Рабочий (фулл-тайм)
 */
public class FullTimeWorker extends Employee {
    
    private Random random2 = new Random();
    
    public FullTimeWorker(String surName, String name, int age, double salary, boolean vacation) {
        super(surName, name, age, salary, vacation);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int displayAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Штатный сотрудник на полной ставке; Зарплата (фиксированная): %.2f (руб.); В отпуске: %b",
                surName, name, displayAge(), calculateSalary(), checkVacation());
    }

    @Override
    public boolean checkVacation() {
        return random2.nextBoolean();
    }

    
}
