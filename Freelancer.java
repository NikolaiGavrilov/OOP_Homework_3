import java.util.Random;

/**
 * Фрилансер (класс-наследник)
 */
public class Freelancer extends Employee{

    /**
    * Рандомная переменная для заполнения
    */
    private Random random1 = new Random();

    /**
    * Переменная, отвечающая за кол-во отработанных часов
    */
    public int hoursPerMonth = random1.nextInt(20,30);

    /**
    * Переменная, отвечающая за размер оплаты за час
    */
    public double salaryPerHour = random1.nextInt(500, 2000);

    public Freelancer(String surName, String name, int age, double salary, boolean vacation) {
        super(surName, name, age, salary, vacation);
        this.salary = calculateSalary();
    }
    
    /**
    * Подсчет зарплаты исходя из кол-ва отработанных часов и размера оплаты за час
    * @return
    */
    @Override
    public double calculateSalary() {
        return this.salaryPerHour*this.hoursPerMonth;
    }

    @Override
    public int displayAge() {
        return this.age;
    }

    /**
    * Информацию об отпуске в вывод не включаем, так как официально у фрилансеров их нет.
    * @return
    */
    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Зарплата (фиксированная): %.2f (руб.);",
                surName, name, displayAge(), calculateSalary());
    }

    /**
    * Метод возвращает false, поскольку у фрилансеров нет отпусков.
    * @return
    */
    @Override
    public boolean checkVacation() {
        return false;
    }
}
