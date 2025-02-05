import java.util.ArrayList;
import java.util.List;

public class UserControl {
    protected List<User> list;
    public UserControl() {
        this.list = new ArrayList<User>();

    }
    public void addUser(User user) {
        this.list.add(user);
    }
    public void removeUser(User user) {
        this.list.remove(user);

    }
    public User getUser(int id) {
        return this.list.get(id);
    }
    public int getUserCount() {
        return this.list.size();
    }
    public void searchByName(String name) {
        List<User> data = new ArrayList<>();
        for (User user : list) {
            if (user.getName().equals(name)) {
                data.add(user);
            }
        }
    }
}
