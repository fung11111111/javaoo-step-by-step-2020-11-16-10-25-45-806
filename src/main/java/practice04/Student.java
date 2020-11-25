package practice04;

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
        return String.format("%s I am a Student. I am at Class %s.", super.introduce(), getKlass());
    }
}
