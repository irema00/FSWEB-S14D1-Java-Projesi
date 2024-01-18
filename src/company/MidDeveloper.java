package company;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println(getName() + "has started working as Mid-Developer");
    }
}
