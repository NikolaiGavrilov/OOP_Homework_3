
/**
 * Рабочий (фулл-тайм)
 */
public class FullTimeWorker extends Employee {
    public FullTimeWorker(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Штатный сотрудник на полной ставке; Зарплата (фиксированная): %.2f (руб.)",
                surName, name, calculateSalary());
    }
}
