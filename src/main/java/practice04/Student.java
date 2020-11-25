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
        return "My name is "+getName()+". I am "+ getAge()+" years old. I am a Student. I am at Class "+getKlass()+".";
    }
}
