package company.model;

public class Developer extends Employee {

    private final String programmingLanguage;

    public Developer(String employeeId,
                     String name,
                     double baseSalary,
                     String programmingLanguage) {

        super(employeeId, name, baseSalary);

        if (programmingLanguage == null || programmingLanguage.isBlank()){
            throw new IllegalArgumentException("Invalid programmingLanguage!");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode(){

        System.out.println(getName() + " is writing " + programmingLanguage);
    }

    @Override
    public double calculateSalary() {

        double baseSalary = super.calculateSalary();

        double finalSalary = baseSalary * 1.20;

        if (!Double.isFinite(finalSalary)) {
            throw new IllegalArgumentException("Invalid final salary!");
        }

        return finalSalary;
    }

    @Override
    public void showInfo(){

        super.showInfo();

        System.out.println("Programming language: " + programmingLanguage);
    }


}
