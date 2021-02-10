package Lesson1.online;

public class TestEmployee {
    public static void main (String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Зелепукин И.В.", "Младший Java-разработчик","+7777777", 100000, 25);
        employee[1] = new Employee("Бабков Г.Д.", "Старший Java-разработчик","+1111111", 200000, 29);
        employee[2] = new Employee("Ромашкин А.Н.", "Старший Java-разработчик","+3333333", 200000, 42);
        employee[3] = new Employee("Приходько К.К.", "Ведущий Java-разработчик","+2222222", 300000, 34);
        employee[4] = new Employee("Бабушкин Л.В.", "Ведущий Java-разработчик","+8888888", 300000, 37);

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        System.out.println("Задание 5");
        for(int i = 0;  i < employee.length; i++) {
            if(employee[i].getAge() > 40) {
                employee[i].print();
            }
        }
        System.out.println("****************************************");
        System.out.println("Задание 6");
        for(int i = 0; i < employee.length; i++) {
            employee[i].increaseSalary();
            employee[i].print();
        }
    }
}





