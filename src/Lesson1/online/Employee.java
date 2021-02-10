package Lesson1.online;
/*
1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2 Конструктор класса должен заполнять эти поля при создании объекта;
3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
4 Вывести при помощи методов из пункта 3 ФИО и должность.
5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */

public class Employee {
    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

    Employee(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Сотрудник \n" + "ФИО: " + getFIO() + "\nДолжность: " + getPosition() +
                "\nТелефон: " + getPhone() + "\nЗарплата: " + getSalary() + "\nВозраст: " + getAge());
    }

    //6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    public void increaseSalary() {
        if(getAge()>35) {
            setSalary(salary+10000);
        }
    }

    public String getFIO() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
