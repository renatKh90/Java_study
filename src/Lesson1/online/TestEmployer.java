package Lesson1.online;

public class TestEmployer {
    public static void main (String[] args) {
        Employer employer1 = new Employer("Зелепукин И.В.", "Java-разработчик", "+77777", 100000, 25);
        System.out.println("Сотрудник 1\n" + "ФИО: " + employer1.getFIO() + "\nДолжность: " + employer1.getPosition() +
                "\nТелефон: " + employer1.getPhone() + "\nЗарплата: " + employer1.getSalary() + "\nВозраст: " + employer1.getAge());

    }
}
