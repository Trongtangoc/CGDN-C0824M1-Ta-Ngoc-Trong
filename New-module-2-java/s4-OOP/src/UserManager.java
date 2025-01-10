public class UserManager {
    private User[] listUser;
    private int limit;
    public UserManager() {}

    public UserManager(int limit) {
    this.listUser = new User[0];
    this.limit = limit;
    }

    public void addUser(User user) {
        int totalCurrentUser = listUser.length;
        if (totalCurrentUser < limit) {
            listUser[totalCurrentUser] = user;
        }
        else {
            System.out.println("User list is full. Cannot add more users.");
        }
    }
    public void removeUser(int id) {
        boolean found = false;
        int totalCurrentUser = listUser.length;

        for (int i = 0; i < totalCurrentUser; i++) {
            if (listUser[i].getId() == id) {
                found = true;
                for (int j = i; j < totalCurrentUser - 1; j++) {
                    listUser[j] = listUser[j + 1];
                }
                listUser[totalCurrentUser - 1] = null;
                totalCurrentUser--;
                System.out.println("User with ID " + id + " has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("User with ID " + id + " not found.");
        }
    }
    public void showListUser() {
        int totalCurrentUser = listUser.length;

        if (totalCurrentUser == 0) {
            System.out.println("The user list is empty.");
        } else {
            for (int i = 0; i < totalCurrentUser; i++) {
                System.out.println(listUser[i]);
            }
        }
    }
}
