package company.model;

public class Manager extends Employee {

    private final int teamSize;

    public Manager(String employeeId,
                   String name,
                   double baseSalary,
                   int teamSize) {

        super(employeeId, name, baseSalary);

        if (teamSize < 0){
            throw new IllegalArgumentException("Invalid teamSize!");
        }
        this.teamSize = teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void manageTeam(){

        System.out.println(super.getName() + " is managing a team of " + teamSize + " people." );
    }

    @Override
    public double calculateSalary() {

        double baseSalary = super.calculateSalary();
        double finalSalary = baseSalary + (baseSalary * teamSize * 0.02);

        if (!Double.isFinite(finalSalary)){
            throw new IllegalArgumentException("Invalid finalSalary!");
        }

        return finalSalary;
    }

    @Override
    public void showInfo() {
        super.showInfo();

        System.out.println("TeamSize: " + teamSize);
    }
}
