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

}
