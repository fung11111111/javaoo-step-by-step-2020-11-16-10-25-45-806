package practice08;


public class Teacher extends Person{
    private Klass klass;


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
        if (getKlass() == null) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        }
        return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), getKlass().getNumber());
    }

    public String introduceWith(Student jerry) {
        if (getKlass().equals(jerry.getKlass())){
            //"My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), jerry.getName());
        }
        return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), jerry.getName());


    }
}
