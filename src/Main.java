import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        tasc1();
        System.out.println();
        tasc1_1();
        System.out.println();
        tasc2();
        System.out.println();
        tasc3();
    }

    public static void tasc1() {
        System.out.println("Задача 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName= "Ivanovich";
        String fullName= firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);
    }
    public static void tasc1_1() {
        System.out.println("Задача 1_1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstName");
        String firstName = scanner.next();
        System.out.println("Enter your middleName");
        String middleName = scanner.next();
        System.out.println("Enter your lastName");
        String lastName = scanner.next();
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);

    }
    public static void tasc2() {
        System.out.println("Задача 2");

        String fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName1);

    }

    public static void tasc3() {
        System.out.println("задача 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullName);
    }
}