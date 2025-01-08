public class UserManager {
    private User[] listUser;
    private int size;
    public UserManager() {
        listUser = new User[100];
        this.size = size;
    }
    public void addUser(User user) {
        int totalCurrentUser = listUser.length;
        User[] newListUser = new User[totalCurrentUser + 1];
    }
    public void removeUser(User user) {
        int totalCurrentUser = listUser.length;
        User[] newListUser = new User[totalCurrentUser - 1];
    }
    public void showListUser() {
        for (User user : listUser) {
            System.out.println(user);
        }
    }
}
