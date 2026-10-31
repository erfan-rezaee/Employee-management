package app;

import company.model.Developer;
import company.model.Employee;
import company.model.Manager;

public class Main {
    public static void main(String[] args){

        Employee employee =
                new Employee("EMP-1001",
                        "Sara",
                        20_000_000);

        Developer developer =
                new Developer(
                        "DEV-1001",
                        "Ali",
                        35_000_000,
                        "Java"
                );

        Manager manager =
                new Manager(
                        "MNG-1001",
                        "Reza",
                        50_000_000,
                        5
                );

        Employee employee1 =
                new Developer(
                        "DEV-1002",
                        "Mohammad",
                        40_000_000,
                        "Python"
                );
        if (employee1 instanceof Developer dev) {
            dev.writeCode();
        }

        System.out.println("========== Employees  ==========");
        employee.increaseSalary(10);
        employee.showInfo();
        System.out.println();

        System.out.println("========== Developers ==========");
        developer.showInfo();
        developer.writeCode();
        System.out.println();
        employee1.showInfo();
        ((Developer) employee1).writeCode();
        System.out.println();

        System.out.println("========== Manager ==========");
        manager.showInfo();
        manager.manageTeam();

        //(UpCasting)
        //Employee employee1 =
        //        new Developer(
        //            "DEV-1002",
        //            "Mohammad",
        //            40_000_000,
        //            "Python"
        //        );
        //employee1.showInfo(); This method is valid
        //employee1.writeCode(); This method is invalid because the reference class is Employee.

    }
}
