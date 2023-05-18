public class Main {
    public static void main(String[] args) {

        tasc1();
    }

    public static void tasc1() {
        System.out.println("Задача 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName= "Ivanovich";
        String fullName= firstName + middleName + lastName;
        System.out.println("ФИО сотрудника" + fullName);
    }
}