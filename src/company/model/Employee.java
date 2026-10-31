package company.model;

import javax.print.attribute.standard.MediaName;

public class Employee {

    private final String employeeId;
    private final String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary){

        if (employeeId == null || employeeId.isBlank()){
            throw new IllegalArgumentException("Invalid employeeId!");
        }

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid employeeId!");
        }

        if (!Double.isFinite(baseSalary) || baseSalary <= 0){
            throw new IllegalArgumentException("Invalid baseSalary!");
        }

        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void increaseSalary(double percentage){

        double newBaseSalary = baseSalary + (baseSalary * percentage/100);

        if (!Double.isFinite(newBaseSalary) || newBaseSalary <= 0){
            throw new IllegalArgumentException("Invalid increasing!");
        }
        baseSalary = newBaseSalary;
    }

    public void showInfo(){

        System.out.println("EmployeeId: " + employeeId);
        System.out.println("Name: " + name);
        System.out.printf("BaseSalary: %.1f%n", baseSalary);
    }

}
