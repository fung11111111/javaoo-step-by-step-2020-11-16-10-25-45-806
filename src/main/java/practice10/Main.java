package practice10;

import java.util.LinkedList;

public class Main {
    public static void main(String args[]){
        Klass klass2 = new Klass(2);
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        linkedList.add(klass2);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));

        klass2.appendMember(jerry);
        //"I am Tom. I know Jerry has joined Class 2.\n"

        //assertThat(systemOut().endsWith("I am Tom. I know Jerry has joined Class 2.\n")).isTrue();
    }
}
