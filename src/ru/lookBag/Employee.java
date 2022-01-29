package ru.lookBag;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String secondName;
    private String fullName = secondName + " " + firstName + " " + middleName;
    private int department;
    private int salary;
    private final int id;
    private static int counterId;

    public Employee( String secondName, String firstName, String middleName, int department, int salary){
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.fullName = secondName + " " + firstName + " " + middleName;
        this.department = checkAvailabilityOfDepartment(department);
        this.salary = salary;
        id = counterId;
        counterId++;
    }

    public Employee(){
        double randomCount = Math.random();
        if(randomCount <= 0.5) {
            this.firstName = GeneratorName.generatorMaleFirstNames();
            this.middleName = GeneratorName.generatorMaleMiddleName();
            this.secondName = GeneratorName.generatorMaleSecondName();
        } else {
            this.firstName = GeneratorName.generatorFemaleFirstNames();
            this.middleName = GeneratorName.generatorFemaleMiddleName();
            this.secondName = GeneratorName.generatorFemaleSecondName();
        }

        this.fullName = secondName + " " + firstName + " " + middleName;
        this.department = (int)(Math.random() * 5 + 1);
        this.salary = (int)(Math.random() * 80000 + 60000);
        id = counterId;
        counterId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = checkAvailabilityOfDepartment(department);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.id + "  " + this.fullName + "  " + this.department + "  " + this.salary;
    }

    @Override
    public boolean equals(Object other){
        if(this.getClass() != other.getClass()){
            return false;
        }
        Employee emp = (Employee) other;
        if(this.fullName.equals(emp.getFullName())){
            if(this.department == emp.getDepartment()) {
                return this.salary == emp.getSalary();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department);
    }

    private int checkAvailabilityOfDepartment(int department){
        if(department > 5){
            return 5;
        } else if (department <= 0){
            return 1;
        } else {
            return department;
        }
    }
}
