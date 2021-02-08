package Lesson1.online;

public class TestEmployer {
    public static void main (String[] args) {
        Employer employer1 = new Employer( "Зелепукин Игнат Аккордионович", "Программист", "+77777777", 1000000, 195);
        System.out.println("Сотрудник 1\n" + "ФИО: " + employer1.getFIO());
        System.out.println("Телефон: " + employer1.getPhone());
        System.out.println("Должность: " + employer1.getPosition());
        System.out.println("Зарплата: " + employer1.getSalary() + " рублей");
        System.out.println("Возвраст: " + employer1.getAge() + " лет");

    }
}
