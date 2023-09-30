import java.util.Random;

/**
 * Рабочий на полставки (класс-наследник)
 */
public class HalfTimeWorker extends Employee {
    
    private Random random3 = new Random();
    
    public HalfTimeWorker(String surName, String name, int age, double salary, boolean vacation) {
        super(surName, name, age, salary, vacation);
    }

    /**
    * Подсчет зарплаты исходя из ставки 0.5, то есть зарплата делится на пополам
    * @return
    */
    @Override
    public double calculateSalary() {
        return salary/2;
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
        return random3.nextBoolean();
    }
}
