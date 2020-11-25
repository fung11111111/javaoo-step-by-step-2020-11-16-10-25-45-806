package practice06;

public class Student extends Person{
    private int schoolClass;
    private Klass klass;
    public Student(String name, int age, int schClass) {
        super(name, age);
        this.schoolClass = schClass;
    }
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class "+getKlass().getNumber()+".";
    }
}
