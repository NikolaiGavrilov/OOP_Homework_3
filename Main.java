// Доработать приложение, которое мы разрабатывали на уроке. 
// Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

// 1. Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
// Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная 
// заработная плата = 20.8 * 8 * почасовая ставка»
// 2. Переработать метод generateEmployees, метод должен создавать случайного сотрудника 
// (Worker, Freelancer или любого другого). Метод должен быть один!
// 3. Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
// Тогда добавьте соответствующее состояние на уровне ваших классов).
// 4. Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
// Формат сдачи: ссылка на гитхаб проект

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Employee[] employeesList = generateEmployees(10);
        for (Employee employee: employeesList) {
                System.out.println(employee);
            }

        System.out.println();

        Arrays.sort(employeesList, new SalaryComparator(SortType.Descending));

        for (Employee employee: employeesList) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employeesList, new AgeComparator(SortType.Ascending));
        
        for (Employee employee: employeesList) {
            System.out.println(employee);
        }

    }

    private static Random random = new Random();

    static Employee generateWorker(){
        
        String[] names = new String[] { "Николай", "Ян", "Владимир", "Виталий", "Георгий", "Денис", "Андрей", "Иван", "Михаил", "Василий", "Харис", "Анатолий", "Евгений", "Максим", "Александр", "Павел", "Роман" };
        String[] surNames = new String[] { "Иванов", "Петров", "Орлов", "Сазонов", "Баданов", "Сальников", "Калинин", "Горбатов", "Утин", "Трофимов", "Колесников", "Бойков", "Зарубин" };
        int[] ages = new int[] { 23, 25, 26, 27, 31, 32, 34, 35, 37, 39, 41, 42, 44, 46, 47, 50, 52, 55, 58, 60 };
        int salary = random.nextInt(60000, 120000);

        int randomInt = random.nextInt(3);
        if (randomInt == 1){
            Employee workerFreelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], ages[random.nextInt(ages.length)], salary, random.nextBoolean());
            return workerFreelancer;
        } else if (randomInt == 2) {
            Employee workerFullTimeWorker = new FullTimeWorker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], ages[random.nextInt(ages.length)], salary, random.nextBoolean());
            return workerFullTimeWorker;
        } else {
            Employee workerHalfTimeWorker = new HalfTimeWorker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], ages[random.nextInt(ages.length)], salary, random.nextBoolean());
            return workerHalfTimeWorker;
        }
    }

    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateWorker();
        } return array;
    }

}
