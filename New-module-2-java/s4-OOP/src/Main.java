public class Main {
    public static void main(String[] args) {
        // Khoi tao object user;
//        User user1 = new User();
//        User user2 = new User(" name 01", 30);
//        System.out.println(user2.getName());

        UserManager userManager = new UserManager(4);
        userManager.addUser(new User(1, "Alice", "alice@example.com", 25));
        userManager.addUser(new User(2, "Bob", "bob@example.com", 30));
        userManager.addUser(new User(3, "Charlie", "charlie@example.com", 22));
        // Hiển thị danh sách User
        System.out.println("User List:");
        userManager.showListUser();

        // Xóa User với ID = 2
//        userManager.removeUser(2);

        // Hiển thị danh sách User sau khi xóa
//        System.out.println("User List after removal:");
//        userManager.showListUser();
//        User[] list = new User[10];
//        for (int i = 0; i < 10; i++) {
//            User user = new User();
//            list[i] = user;
//        }
//        for (User item : list){
//            System.out.println(item);
//        }
        
    }
}