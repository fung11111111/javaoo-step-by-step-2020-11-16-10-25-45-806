package practice09;


import java.util.ArrayList;
public class Klass {
    private int classNum;
    private Student leader;
    private ArrayList<Student> studentList;

    public Klass(int classNum) {
        this.classNum = classNum;
        leader = null;
        studentList = new ArrayList<>();
    }

    public int getNumber() {
        return classNum;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader) {
        if (!this.studentList.contains(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = leader;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }
}
