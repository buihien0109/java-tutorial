package demo_abstract;

public class Developer extends Employee {
    private int overTimeHours;

    public Developer() {
    }

    public Developer(int id, String name, String email, int basicSalary, int overTimeHours) {
        super(id, name, email, basicSalary);
        this.overTimeHours = overTimeHours;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + overTimeHours * 200_000;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }
}
