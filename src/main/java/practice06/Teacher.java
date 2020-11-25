package practice06;

public class Teacher extends Person{
    private int schoolClass;
    private Boolean noClass;
    private Klass klass;
    public Teacher(String name, int age, int schClass) {
        super(name, age);
        this.schoolClass = schClass;
        this.noClass = false;
    }
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.noClass = false;
    }
    public Teacher(String name, int age){
        super(name, age);
        this.noClass = true;
    }

    public Klass getKlass(){
        return klass;
    }

    public Boolean getNoClass() {
        return noClass;
    }


    @Override
    public String introduce(){
        if(getNoClass()){
            return "My name is "+getName()+". I am "+ getAge()+" years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+getName()+". I am "+ getAge()+" years old. I am a Teacher. I teach Class "+getKlass().getNumber()+".";
        }

    }

    public String introduceWith(Student jerry) {
        if (getKlass().equals(jerry.getKlass())){
            return "My name is "+getName()+". I am "+ getAge()+" years old. I am a Teacher. I teach "+jerry.getName()+".";
        }else{
            return "My name is "+getName()+". I am "+ getAge()+" years old. I am a Teacher. I don't teach "+jerry.getName()+".";
        }

    }
}
