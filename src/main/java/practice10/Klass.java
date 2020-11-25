package practice10;


import java.util.ArrayList;

public class Klass {
    private int classNum;
    private Student leader;
    private ArrayList<Student> studentList;
    private Teacher teacher;

    public Klass(int classNum) {
        this.classNum = classNum;
        leader = null;
        studentList = new ArrayList<>();
        teacher = null;
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
        if(getTeacher() != null){
            System.out.print(String.format("I am %s. I know %s become Leader of %s.\n",getTeacher().getName(),leader.getName(),getDisplayName()));
        }

        this.leader = leader;
    }

    public Student getLeader() {
        return this.leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void appendMember(Student student) {
        studentList.add(student);
        if(getTeacher() != null){
            String msg = String.format("I am %s. I know %s has joined %s.\n",getTeacher().getName(),student.getName(),getDisplayName());
            System.out.print(msg);
        }
    }
}
