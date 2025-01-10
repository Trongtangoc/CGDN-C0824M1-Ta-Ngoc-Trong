public class Main {
    public static void main(String[] args) {
        // Khoi tao object user;
//        User user1 = new User();
//        User user2 = new User(" name 01", 30);
//        System.out.println(user2.getName());
        User[] list = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            list[i] = user;
        }
        for (User item : list){
            System.out.println(item);
        }
        
    }
}