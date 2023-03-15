import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String fullName = ("Ivanov");
        String fio = fullName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fio);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String fullName = ("Ivanov");
        String fio = fullName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fio.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        String fixName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixName);
    }

}