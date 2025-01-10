public class User {
    private int id;
    private String name;
    private String email;
    private int age;


    public User() {

    }
    public User(int id ,String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void getInfo(){
        System.out.print("id: " + id);
        System.out.print("Name: " + name);
        System.out.print("Email: " + email);
        System.out.print("Age: " + age);

    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "id= " + id + ", name='" + name + "', age='" + age + "'";
    }
}
