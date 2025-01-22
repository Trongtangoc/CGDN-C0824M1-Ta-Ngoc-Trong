import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(1);t
//        for (Integer i : list) {
//            System.out.println(i);
//        }


//        List<User> users = new ArrayList<>();
//        User u1 = new User("Linh", 30);
//        User u2 = new User("Mary", 30);
//        users.add(u1);
//        users.add(u2);
//        System.out.println(users);
        Scanner sc = new Scanner(System.in);

while (true){
    System.out.println("--User management");
    System.out.println("1.Show list users");
    System.out.println("2.add a new users");
    System.out.println("3.remove a user");
    System.out.println("4.exit");
    int choice = Integer.parseInt(sc.nextLine());
    if (choice == ChoiceConstant.EXIT) {
        break;
    }
}

    }
}
