package practice09;

public class Person {
    private final String name;
    private final int age;

    private final int id;

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String introduce(){
        return String.format("My name is %s. I am %s years old.", getName(), getAge());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }
        if(this.id != other.id){
            return false;
        }

        return true;
    }
}
