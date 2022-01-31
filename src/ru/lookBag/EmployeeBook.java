package ru.lookBag;

public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook(Employee[] EmployeeBook){
        this.employeeBook = EmployeeBook;
    }

    public EmployeeBook(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        Employee e7 = new Employee();
        Employee e8 = new Employee();
        Employee e9 = new Employee();
        Employee e10 = new Employee();
        Employee e11 = new Employee();
        Employee e12 = new Employee();
        Employee e13 = new Employee();
        Employee e14 = new Employee();
        Employee e15 = new Employee();
        Employee e16 = new Employee();
        Employee e17 = new Employee();
        Employee e18 = new Employee();
        Employee e19 = new Employee();
        Employee e20 = new Employee();
        Employee e21 = new Employee();
        Employee e22 = new Employee();
        Employee e23 = new Employee();
        Employee e24 = new Employee();
        this.employeeBook = new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24};

    }

    public Employee[] getEmployeeBook() {
        return employeeBook;
    }

    public void readEmployeeBook(){
        String separationChar = "| ";
        System.out.println("ID   " + separationChar + "Фамилия Имя Отчество                    " + separationChar + "Отдел  " + separationChar + "Зарплата ");
        for (int i = 0; i < employeeBook.length; i++) {
            int numCharForID = 5;
            int numCharForFullName = 40;
            int numCharForDepartment = 7;
            int numCharForSalary = 8;
            String[] split = employeeBook[i].toString().split("  ");
            int differenceNumCharForID = numCharForID - split[0].length();
            int differenceNumCharForFullName = numCharForFullName - split[1].length();
            int differenceNumCharForDepartment = numCharForDepartment - split[2].length();
            int differenceNumCharForSalary = numCharForSalary - split[3].length();
            for (int j = 0; j < differenceNumCharForID; j++) {
                split[0] = split[0] + " ";
            }
            for (int j = 0; j < differenceNumCharForFullName; j++) {
                split[1] = split[1] + " ";
            }
            for (int j = 0; j < differenceNumCharForDepartment; j++) {
                split[2] = split[2] + " ";
            }
            for (int j = 0; j < differenceNumCharForSalary; j++) {
                split[3] = split[3] + " ";
            }
            if (employeeBook[i].getFirstName() != null || employeeBook[i].getSecondName() != null || employeeBook[i].getMiddleName() != null) {
                System.out.println(split[0] + separationChar + split[1] + separationChar + split[2] + separationChar + split[3]);
            } else {
                System.out.println(split[0] + separationChar + "Нет сотрудника");
            }
        }
        System.out.println();
    }

    public void readEmployeeBook(int department){
        String separationChar = "| ";
        System.out.println("Сотрудники " + department + " отдела:");
        System.out.println("ID   " + separationChar + "Фамилия Имя Отчество                    " + separationChar + "Зарплата ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                int numCharForID = 5;
                int numCharForFullName = 40;
                int numCharForSalary = 8;

                String[] split = employeeBook[i].toString().split("  ");
                int differenceNumCharForID = numCharForID - split[0].length();
                int differenceNumCharForFullName = numCharForFullName - split[1].length();
                int differenceNumCharForSalary = numCharForSalary - split[3].length();
                for (int j = 0; j < differenceNumCharForID; j++) {
                    split[0] = split[0] + " ";
                }
                for (int j = 0; j < differenceNumCharForFullName; j++) {
                    split[1] = split[1] + " ";
                }
                for (int j = 0; j < differenceNumCharForSalary; j++) {
                    split[3] = split[3] + " ";
                }
                if (employeeBook[i].getFirstName() != null || employeeBook[i].getSecondName() != null || employeeBook[i].getMiddleName() != null) {
                    System.out.println(split[0] + separationChar + split[1] + separationChar + split[3]);
                } else {
                    System.out.println(split[0] + separationChar + "Нет сотрудника");
                }
            }
        }
        System.out.println();
    }

    public void readEmployeeBookByDepartment(){
        int department = 5;
        String separationChar = "| ";
        System.out.println("ID   " + separationChar + "Фамилия Имя Отчество                    " + separationChar + "Зарплата ");
        for (int i = 1; i - 1 < department; i++) {
            int count = 0;
            System.out.println("Сотрудники " + i + " отдела:");
            for (int k = 0; k < employeeBook.length; k++) {
                if (employeeBook[k].getDepartment() == i) {
                    int numCharForID = 5;
                    int numCharForFullName = 40;
                    int numCharForSalary = 8;

                    String[] split = employeeBook[k].toString().split("  ");
                    int differenceNumCharForID = numCharForID - split[0].length();
                    int differenceNumCharForFullName = numCharForFullName - split[1].length();
                    int differenceNumCharForSalary = numCharForSalary - split[3].length();
                    for (int j = 0; j < differenceNumCharForID; j++) {
                        split[0] = split[0] + " ";
                    }
                    for (int j = 0; j < differenceNumCharForFullName; j++) {
                            split[1] = split[1] + " ";
                    }
                    for (int j = 0; j < differenceNumCharForSalary; j++) {
                        split[3] = split[3] + " ";
                    }
                    if (employeeBook[k].getFirstName() != null || employeeBook[k].getSecondName() != null || employeeBook[k].getMiddleName() != null) {
                        System.out.println(split[0] + separationChar + split[1] + separationChar + split[3]);
                    } else if (employeeBook[k].getFullName() == null){
                        System.out.println(split[0] + separationChar + "Нет сотрудника");
                    }
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("В " + i + " отделе нет сотрудников");
            }
            count = 0;
        }
        System.out.println();
    }

    public int sumSalary(){
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            sum = sum + employeeBook[i].getSalary();
        }
        return sum;
    }

    public void searchMaxSalary(){
        int maxSalary = 0;
        String name = "";
        for (int i = 0; i < employeeBook.length; i++) {
            if(employeeBook[i].getSalary() > maxSalary){
                maxSalary = employeeBook[i].getSalary();
                name = employeeBook[i].getFullName();
            }
        }
        System.out.println(name + " имеет самую максимальную зарплату (" + maxSalary + ")");
        System.out.println();
    }

    public void searchMaxSalary(int department){
        int maxSalary = -1;
        String name = "";
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department){
                if(employeeBook[i].getSalary() > maxSalary){
                    maxSalary = employeeBook[i].getSalary();
                    name = employeeBook[i].getFullName();
                }
            }

        }
        if(maxSalary != -1){
            System.out.println(name + " имеет самую максимальную зарплату (" + maxSalary + ") в " + department + " отделе" );
            System.out.println();
        } else {
            System.out.println("В "+ department + " отделе нет сотрудников!");
            System.out.println();
        }
    }

    public void searchMinSalary(){
        int minSalary = Integer.MAX_VALUE;
        String name = "";
        for (int i = 0; i < employeeBook.length; i++) {
            if(employeeBook[i].getSalary() < minSalary){
                minSalary = employeeBook[i].getSalary();
                name = employeeBook[i].getFullName();
            }
        }
        System.out.println(name + " имеет самую минимальную зарплату (" + minSalary + ")");
        System.out.println();
    }

    public void searchMinSalary(int department){
        int minSalary = 999999999;
        String name = "";
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department){
                if(employeeBook[i].getSalary() < minSalary){
                    minSalary = employeeBook[i].getSalary();
                    name = employeeBook[i].getFullName();
                }
            }

        }
        if(minSalary != 999999999){
            System.out.println(name + " имеет самую минимальную зарплату (" + minSalary + ") в " + department + " отделе" );
            System.out.println();
        } else {
            System.out.println("В "+ department + " отделе нет сотрудников!");
            System.out.println();
        }
    }

    public void calculateAverage(){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null){
                sum = sum + employeeBook[i].getSalary();
                count++;
            }
        }
        double average = (double) sum / (double) count;
        if (count != 0) {
            System.out.println("Среднее значение зарплат: " + String.format("%.2f", average));
            System.out.println();
        } else {
            System.out.println("В массиве нет сотрудников!");
            System.out.println();
        }
    }

    public void calculateAverage(int department){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department && employeeBook[i] != null){
                sum = sum + employeeBook[i].getSalary();
                count++;
            }
        }
        double average = (double) sum / (double) count;
        if(count != 0){
            System.out.println("Среднее значение зарплат в " + department + " отделе: " + String.format("%.2f", average));
            System.out.println();
        } else {
            System.out.println("В "+ department + " отделе нет сотрудников!");
            System.out.println();
        }
    }

    public void printFullNamesEmployees(){
        System.out.println("Ф.И.О. всех сотрудников: ");
        for (int i = 0; i < employeeBook.length; i++) {
            System.out.println( (i + 1) + ": " + employeeBook[i].getFullName());
        }
        System.out.println();
    }

    public void indexSalary(int percent){
        System.out.println("Индексация всех сотрудников на " + percent + " % - завершена");
        percent = percent + 100;
        for (int i = 0; i < employeeBook.length; i++) {
            employeeBook[i].setSalary(employeeBook[i].getSalary() / 100 * percent);
        }
        System.out.println();
    }

    public void indexSalary(int percent, int department){
        System.out.println("Индексация сотрудников " + department + " отдела на " + percent + " % - завершена");
        percent = percent + 100;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                employeeBook[i].setSalary(employeeBook[i].getSalary() / 100 * percent);
            }
        }
        System.out.println();
    }

    public void salaryMore(int salaryForComparison){
        String separationChar = "| ";
        System.out.println("Сотрудники с зарплатой больше " + salaryForComparison + ":");
        System.out.println("ID   " + separationChar + "Фамилия Имя Отчество                    " + separationChar + "Зарплата ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() >= salaryForComparison) {
                int numCharForID = 5;
                int numCharForFullName = 40;
                int numCharForSalary = 8;

                String[] split = employeeBook[i].toString().split("  ");
                int differenceNumCharForID = numCharForID - split[0].length();
                int differenceNumCharForFullName = numCharForFullName - split[1].length();
                int differenceNumCharForSalary = numCharForSalary - split[3].length();
                for (int j = 0; j < differenceNumCharForID; j++) {
                    split[0] = split[0] + " ";
                }
                for (int j = 0; j < differenceNumCharForFullName; j++) {
                    split[1] = split[1] + " ";
                }
                for (int j = 0; j < differenceNumCharForSalary; j++) {
                    split[3] = split[3] + " ";
                }
                if (employeeBook[i] != null){
                    System.out.println(split[0] + separationChar + split[1] + separationChar + split[3]);
                }
            }
        }
        System.out.println();
    }

    public void salaryLess(int salaryForComparison){
        String separationChar = "| ";
        System.out.println("Сотрудники с зарплатой меньше " + salaryForComparison + ":");
        System.out.println("ID   " + separationChar + "Фамилия Имя Отчество                    " + separationChar + "Зарплата ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() < salaryForComparison && employeeBook[i].getFirstName() != null) {
                int numCharForID = 5;
                int numCharForFullName = 40;
                int numCharForSalary = 8;

                String[] split = employeeBook[i].toString().split("  ");
                int differenceNumCharForID = numCharForID - split[0].length();
                int differenceNumCharForFullName = numCharForFullName - split[1].length();
                int differenceNumCharForSalary = numCharForSalary - split[3].length();
                for (int j = 0; j < differenceNumCharForID; j++) {
                    split[0] = split[0] + " ";
                }
                for (int j = 0; j < differenceNumCharForFullName; j++) {
                    split[1] = split[1] + " ";
                }
                for (int j = 0; j < differenceNumCharForSalary; j++) {
                    split[3] = split[3] + " ";
                }
                if (employeeBook[i] != null){
                    System.out.println(split[0] + separationChar + split[1] + separationChar + split[3]);
                }
            }
        }
        System.out.println();
    }

    public void addEmployee(String secondName, String firstName, String middleName, int department, int salary){
        Employee employee = new Employee(secondName, firstName, middleName,  department, salary);
        int countNull = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getFirstName() == null || employeeBook[i].getSecondName() == null || employeeBook[i].getMiddleName() == null){
                employeeBook[i].setFirstName(firstName);
                employeeBook[i].setSecondName(secondName);
                employeeBook[i].setMiddleName(middleName);
                employeeBook[i].setDepartment(department);
                employeeBook[i].setFullName(secondName + " " + firstName + " " + middleName);
                employeeBook[i].setSalary(salary);
                System.out.println( employee.getFullName() + " добавлен в " + employee.getDepartment() + " отдел с зарпалтой " + employee.getSalary());
                System.out.println();
                countNull++;
                break;
            }
        }
        if (countNull <= 0) {
            System.out.println("Невозможно добавить сотрудника!");
            System.out.println();
        }
    }

    public void deleteEmployee(String fullName, int id){
        int count = 0;
        if(fullName != null && id >= 0){
            for (int i = 0; i < employeeBook.length; i++) {
                if(employeeBook[i].getFirstName() != null || employeeBook[i].getSecondName() != null || employeeBook[i].getMiddleName() != null){
                    if (employeeBook[i].getFullName().equals(fullName) && employeeBook[i].getId() == id){
                        employeeBook[i] = null;
                        System.out.println( fullName + " под " + id +" id удален!");
                        System.out.println();
                        break;
                    }
                } else if (id > employeeBook.length){
                    System.out.println( fullName + " такого сотрудника не существует!");
                    System.out.println();
                    break;
                }
                count++;
            }
            if (count == employeeBook.length){
                System.out.println("Задайте правильные парамметры для удаления сотрудника!");
                System.out.println();
            }
        } else {
            System.out.println("Задайте правильные парамметры для удаления сотрудника!");
            System.out.println();
        }
    }

    public void deleteEmployee(String fullName){
        if(fullName != null){
            for (int i = 0; i < employeeBook.length; i++) {
                if(employeeBook[i].getFirstName() != null || employeeBook[i].getSecondName() != null || employeeBook[i].getMiddleName() != null){
                    if (employeeBook[i].getFullName().equals(fullName)){
                        employeeBook[i].setFirstName(null);
                        employeeBook[i].setSecondName(null);
                        employeeBook[i].setMiddleName(null);
                        employeeBook[i].setDepartment(0);
                        employeeBook[i].setFullName(null);
                        employeeBook[i].setSalary(0);
                        System.out.println( fullName + " удален!");
                        System.out.println();
                        return;
                    }
                } else {
                    System.out.println( fullName + " такого сотрудника не существует!");
                    System.out.println();
                    break;
                }
            }
        } else {
            System.out.println("Задайте правильные парамметры для удаления сотрудника!");
            System.out.println();
        }
    }

    public void deleteEmployee(int id){
        if (id >= 0){
            for (int i = 0; i < employeeBook.length; i++) {
                if(employeeBook[i].getFirstName() != null && employeeBook[i].getSecondName() != null && employeeBook[i].getMiddleName() != null){
                    if (employeeBook[i].getId() == id){
                        employeeBook[i].setFirstName(null);
                        employeeBook[i].setSecondName(null);
                        employeeBook[i].setMiddleName(null);
                        employeeBook[i].setDepartment(0);
                        employeeBook[i].setFullName(null);
                        employeeBook[i].setSalary(0);
                        System.out.println( "Сотрудник под " + id  + " id удален!");
                        System.out.println();
                        break;
                    }
                } else if (id > employeeBook.length) {
                    System.out.println( "Сотрудника под " + id  + " id не существует!");
                    System.out.println();
                }
            }
        } else {
            System.out.println("Задайте правильные для удаления сотрудника!");
            System.out.println();
        }
    }

    public void setSalary(String fullName, int salary){
        for (int i = 0; i < employeeBook.length; i++) {
            if(employeeBook[i].getFullName().equals(fullName)){
                System.out.println("Сотрудник \"" + fullName + "\" получал: " + employeeBook[i].getSalary() + " теперь получает: " + salary);
                employeeBook[i].setSalary(salary);
                System.out.println();
                break;
            }
        }
    }

    public void setDepartment(String fullName, int department){
        for (int i = 0; i < employeeBook.length; i++) {
            if(department > 5) {
                System.out.println(department + " отдела не существует!");
                System.out.println();
                break;
            }
            if(employeeBook[i].getFullName().equals(fullName)){
                System.out.println("Сотрудник \"" + fullName + "\" был в " + employeeBook[i].getDepartment() + " отделе, теперь в " + department + " отделе");
                employeeBook[i].setDepartment(department);
                System.out.println();
                break;
            }
        }
    }
}
