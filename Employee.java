
/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Возраст
     */
    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * В отпуске или нет
     */
    protected boolean vacation;


    /**
     * Расчет среднемесячной заработной платы сотрудника
     * @return
     */
    public abstract double calculateSalary();

    /**
     * Получение информации о возрасте
     * @return
     */
    public abstract int displayAge();

    /**
     * Получение информации о том, в отпуске человек или нет
     * @return
     */
    public abstract boolean checkVacation();


    public Employee(String surName, String name, int age, double salary, boolean vacation) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.vacation = vacation;
    }

    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
