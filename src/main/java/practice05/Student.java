package practice05;

public class Student extends Person{
    private int schoolClass;
    public Student(String name, int age, int schClass) {
        super(name, age);
        this.schoolClass = schClass;
    }

    public int getKlass() {
        return schoolClass;
    }
    @Override
    public String introduce(){
        return String.format("My name is %s. I am %s years old.", getName(), getAge());
    }
}
