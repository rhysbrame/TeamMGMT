package example.codeclan.com.footballmanager;

import java.util.ArrayList;

public class Manager extends Person {
    private double managerForm;

    public Manager(String personName, int personAge, Sex sex, double managerForm) {
        super(personName, personAge, sex);
        this.managerForm = managerForm;
    }

    public void setManagerForm(double form) {
        managerForm = form;
    }

    public double getManagerForm() {
        return managerForm;
    }

}
