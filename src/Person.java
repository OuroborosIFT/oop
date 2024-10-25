import java.util.Calendar;

public class Person {

    private String name;
    private String surename;
    private Calendar bd;

    public Person() {
    }

    public Person(String name, String surename, Calendar bd) {
        this.name = name;
        this.surename = surename;
        this.bd = bd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Calendar getBd() {
        return bd;
    }

    public void setBd(Calendar bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", bd=" + bd +
                '}';
    }

    public String toShortString() {
        return "name " + name +
                "surename " + surename;
    }
}
