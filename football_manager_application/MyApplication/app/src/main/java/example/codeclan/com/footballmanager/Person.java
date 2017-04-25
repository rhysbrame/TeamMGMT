package example.codeclan.com.footballmanager;

public class Person {

    private String personName;
    private int personAge;
    private Sex sex;

    public Person(String personName, Integer personAge, Sex sex) {
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

    public void setPersonAge(Integer age){
        personAge = age;
    }

    public Integer getPersonAge() {
        return personAge;
    }

//    public void setSex
}

//    public TeamTypes getTeamType() {
//        return type;
//    }
//
//    public int getTeamSize(){
//        return teamSize;
//    }
//
//    public void setTeamForm(double form){
//        teamForm = form;
//    }
//
//    public double getTeamForm(){
//        return teamForm;
//    }
