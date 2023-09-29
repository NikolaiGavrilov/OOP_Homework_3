
// import java.util.Arrays;
// import java.util.Random;

// public class Task2 {

//     private static Random random = new Random();

//     static Worker generateWorker(){
//         String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
//         String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

//         int salary = random.nextInt(50000, 120000);
//         Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
//         return worker;
//     }

//     /**
//      * TODO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во
//      *  сотрудников различных типов
//      * @param count
//      * @return
//      */
//     static Worker[] generateEmployees(int count){
//         Worker[] array = new Worker[count];
//         for (int i = 0; i < array.length; i++)
//             array[i] = generateWorker();
//         return array;
//     }

//     public static void main(String[] args) {

//         Worker[] employees = generateEmployees(15);

//         Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

//         for (Worker employee: employees) {
//             System.out.println(employee);
//         }

//         System.out.println();

//         Arrays.sort(employees, new SalaryComparator(SortType.Descending));

//         for (Worker employee: employees) {
//             System.out.println(employee);
//         }

//     }












// }
