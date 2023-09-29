public class HalfTimeWorker extends Employee{

    public HalfTimeWorker(String surName, String name, double salary) {
        super(surName, name, salary);
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return salary*0.5;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Штатный сотрудник (на полставки); Зарплата (фиксированная): %.2f (руб.)",
                surName, name, calculateSalary());
    }
    
}
