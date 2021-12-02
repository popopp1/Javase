import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
//        Address address = new Address("guangzhou","panYu","11111");
        User user = new User("ljy",new Address("guangzhou","panYu","11111"));
        User user1 = new User("ljy",new Address("guangzhou","panYu","11111"));
        System.out.println(user.equals(user1));
    }
}

class User{
    String name;
    Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof User)){
            return false;
        }
        User user = (User) o;
        return this.name.equals(user.name) && this.address.equals(user.address);
    }
}

class Address{
    String city;
    String street;
    String zipCode;

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipCode, address.zipCode);
    }
}
