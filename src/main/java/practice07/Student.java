package practice07;



public class Student extends Person{

    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        if (!klass.getLeader().equals(this)){
            return String.format("%s I am a Student. I am at Class %s.", super.introduce(), getKlass().getNumber());
        }
        return String.format("%s I am a Student. I am Leader of Class %s.", super.introduce(), getKlass().getNumber());
    }
}
