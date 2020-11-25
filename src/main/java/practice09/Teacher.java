package practice09;


import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> klassList = new LinkedList<>();


    public Teacher(int id, String name, int age, LinkedList<Klass> klassList) {
        super(id, name, age);
        this.klass = klass;
        this.klassList = klassList;
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (getClasses().size() > 0) {
            String myClasses = getClasses().stream().map(classNum -> Integer.toString(classNum.getNumber())).collect(Collectors.joining(", "));
            return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), myClasses);
        }
        return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student jerry) {
        if (getClasses().contains(jerry.getKlass())){
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), jerry.getName());
        }
        return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), jerry.getName());

    }
    public LinkedList<Klass> getClasses(){
        return this.klassList;
    }

    public Boolean isTeaching(Student student){
        if(getClasses().contains(student.getKlass())){
            return true;
        }
        return false;
    }
}
