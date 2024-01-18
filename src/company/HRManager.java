package company;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
            } else {
                System.out.println("index is occupied");
            }
        } catch
        (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found" + index);
        }

    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
            } else {
                System.out.println("index is occupied");
            }
        } catch
        (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found" + index);
        }

    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
            } else {
                System.out.println("index is occupied");
            }
        } catch
        (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found" + index);
        }

    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + "has started working as HRManager");
    }
}
