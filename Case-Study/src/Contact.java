public class Contact {
    private String phoneNumber, group, name, gender, address, birthday, email;

    public Contact() {

    }

    public Contact(String phoneNumber, String group, String name, String gender, String address, String birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toCSV() {
        return String.join(",", phoneNumber, group, name, gender, address, birthday, email);
    }

    public static Contact fromCSV(String line) {
    String[] parts = line.split(",");
    if(parts.length< 7)
    {
        return null;
    } else{
        return new Contact(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(), parts[4].trim(),
                parts[5].trim(), parts[6].trim()
        );
    }}
    public void update(String group, String name, String gender, String address, String birthday, String email) {
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;

    }
    @Override
    public String toString() {
        return phoneNumber + " - " + name + " - " + group + " - " + gender + " - " + address + " - " + birthday + " - " + email;
    }

}
