package ru.lookBag;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.readEmployeeBook();
        System.out.println();

        System.out.println("Сумма зарплат всех сотрудников: " + employeeBook.sumSalary());
        System.out.println();

        employeeBook.searchMaxSalary();

        employeeBook.searchMinSalary();

        employeeBook.calculateAverage();

        employeeBook.printFullNamesEmployees();

        employeeBook.indexSalary(10);
        employeeBook.readEmployeeBook();

        employeeBook.searchMaxSalary(2);
        employeeBook.searchMinSalary(2);

        employeeBook.calculateAverage(2);

        System.out.println("До индексации:");
        employeeBook.readEmployeeBook(2);

        employeeBook.indexSalary(10, 2);
        employeeBook.readEmployeeBook(2);

        employeeBook.salaryMore(100000);
        employeeBook.salaryLess(80000);

        employeeBook.deleteEmployee(17);

        employeeBook.addEmployee("Игнатьев","Павел","Геннадьевич", 1, 65000);
        employeeBook.readEmployeeBook(1);

        employeeBook.deleteEmployee("Игнатьев Павел Геннадьевич");

        employeeBook.readEmployeeBook(1);

        employeeBook.addEmployee("Игнатьев","Павел","Геннадьевич", 1, 65000);
        employeeBook.readEmployeeBook(1);

        employeeBook.setSalary("Игнатьев Павел Геннадьевич", 75000);
        employeeBook.readEmployeeBook(1);

        employeeBook.setDepartment("Игнатьев Павел Геннадьевич", 3);
        employeeBook.readEmployeeBook(3);

        employeeBook.readEmployeeBookByDepartment();

        System.out.println("Проверяем работу методов в классе \"Employee\" ");
        Employee emp1 = new Employee("Иванов","Иван","Иванович",2,60000);
        Employee emp2 = new Employee("Иванов","Иван","Иванович",2,60000);
        Employee emp3 = new Employee("Зубко","Петр","Петрович",3,55000);
        System.out.println("==============================");
        System.out.println("Проверка сотрудников на равенство: " + emp1.equals(emp2));
        System.out.println("Проверка сотрудников на равенство хэшей: " + (emp1.hashCode() == emp2.hashCode()));
        System.out.println("Проверка разных сотрудников на равенство: " + emp1.equals(emp3));
        System.out.println("Проверка разных сотрудников на равенство хэшей: " + (emp1.hashCode() == emp3.hashCode()));
        System.out.println(emp1);
        System.out.println(emp3);
        System.out.println("==============================");
    }
}