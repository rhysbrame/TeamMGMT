package example.codeclan.com.footballmanager;

public class Person {

    private String personName;
    private int personAge;
    private Sex sex;

    public Person(String personName, int personAge, Sex sex) {
        this.personName = personName;
        this.personAge = personAge;
        this.sex = sex;
    }

    public void setPersonName(String name) {
        personName = name;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonAge(int age){
        personAge = age;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setSex(Sex sexType) {
        sex = sexType;
    }

    public Sex getSex() {
        return sex;
    }
}
