package ss4_Class_object;

public class StudentOfDemoMain {
    //Properties thuoc tinh
    int code;
    String name;
    String address;
    float point;

    //Constructor

    public StudentOfDemoMain(int code, String name, String address, float point) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public StudentOfDemoMain() {

    }

    // Method Phuong thuc

    public void displayRank() {
        if(this.point > 8){

        } else if (this.point > 6.5){

        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
