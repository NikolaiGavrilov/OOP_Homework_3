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
        for (int i = 0; i < 10; i++) {
            System.out.println(generateWorker().toString());
        }
        
    }

    private static Random random = new Random();

    static Employee generateWorker(){
        
        String[] names = new String[] { "Николай", "Ян", "Владимир", "Виталий", "Георгий", "Денис", "Андрей", "Иван", "Михаил", "Василий", "Харис", "Анатолий", "Евгений", "Максим", "Александр", "Павел", "Роман" };
        String[] surNames = new String[] { "Иванов", "Петров", "Орлов", "Сазонов", "Баданов", "Сальников", "Калинин", "Горбатов", "Утин", "Трофимов", "Колесников", "Бойков", "Зарубин" };
        
        int salary = random.nextInt(60000, 120000);

        int randomInt = random.nextInt(3);
        if (randomInt == 1){
            Employee workerFreelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
            return workerFreelancer;
        } else if (randomInt == 2) {
            Employee workerFullTimeWorker = new FullTimeWorker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
            return workerFullTimeWorker;
        } else {
            Employee workerHalfTimeWorker = new HalfTimeWorker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
            return workerHalfTimeWorker;
        }
    }

}
