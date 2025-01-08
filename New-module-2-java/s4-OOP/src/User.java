public class User {
    private int id;
    private String name;
    private String age;

    public User() {

    }
    public User(int id ,String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "id= " + id + ", name='" + name + "', age='" + age + "'";
    }
}
