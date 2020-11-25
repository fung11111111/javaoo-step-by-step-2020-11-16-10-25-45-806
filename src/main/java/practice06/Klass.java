package practice06;

public class Klass {

    private final int classNum;

    public Klass(int classNum) {
        this.classNum = classNum;
    }
    public int getNumber() {
        return classNum;
    }

    public String getDisplayName() {
        return "Class "+ getNumber();
    }
}
