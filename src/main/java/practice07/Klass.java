package practice07;

public class Klass {
    private final int classNum;
    private Student leader;

    public Klass(int classNum) {
        this.classNum = classNum;
        leader = null;
    }
    public int getNumber() {
        return classNum;
    }

    public String getDisplayName() {
        return "Class "+ getNumber();
    }

    public void assignLeader(Student jerry) {
        this.leader = jerry;
    }
    public Student getLeader(){
        return this.leader;
    }
}
