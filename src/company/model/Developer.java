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

        System.out.println(super.getName() + " is writing Java code.");
    }


}
