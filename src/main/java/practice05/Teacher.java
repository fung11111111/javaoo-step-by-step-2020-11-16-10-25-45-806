package practice05;

public class Teacher extends Person{
    private int schoolClass;
    private Boolean noClass;
    public Teacher(String name, int age, int schClass) {
        super(name, age);
        this.schoolClass = schClass;
        this.noClass = false;
    }
    public Teacher(String name, int age){
        super(name, age);
        this.noClass = true;
    }

    public int getKlass() {
        return schoolClass;
    }

    public Boolean getNoClass() {
        return noClass;
    }
    @Override
    public String introduce(){
        if(getNoClass()){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else{
            return super.introduce() + " I am a Teacher. I teach Class "+getKlass()+".";
        }

    }
}
