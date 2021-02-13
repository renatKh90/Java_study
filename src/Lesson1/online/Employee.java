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
    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;
    private int uid;

    private static int id = 0;

    //2 Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.uid = ++id;
    }

    //4 Вывести при помощи методов из пункта 3 ФИО и должность. (решил вывести все поля)
    public void print() {
        System.out.println("Сотрудник № " + getUid() + "\nФИО: " + getFIO() + "\nДолжность: " + getPosition() +
                "\nТелефон: " + getPhone() + "\nЗарплата: " + getSalary() + "\nВозраст: " + getAge());
    }

    //6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    public void increaseSalary() {
        if(getAge()>35) {
            setSalary(salary+10000);
        }
    }

    //3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля; (геттеры)

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
    public int getUid(){
        return uid;
    }

    //сеттер
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
