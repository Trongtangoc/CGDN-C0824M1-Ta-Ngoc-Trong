public class Contact {
    private String phoneNumber;
    private String group;
    private String name;
    private String address;
    private String gender;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, String address, String gender) {
        if (phoneNumber.length() < 10 || phoneNumber.length() > 11) {
            throw new IllegalArgumentException("Phone Number must be between 10 and 11 characters long.");
        }
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() < 10 || phoneNumber.length() > 11) {
            throw new IllegalArgumentException("Phone Number must be between 10 and 11 characters long.");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
