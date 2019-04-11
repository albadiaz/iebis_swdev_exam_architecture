public class User {


    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

    public User setName (String name){
        this.name = name;
        return this;
    }

    public User setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public User setAge(int age){
        this.age = age;
        return this;
    }

    public User setAddress(String address){
        this.address = address;
        return this;
    }

    public User setCity(String city){
        this.city = city;
        return this;
    }

    public User setZipCode(String zipCode){
        this.zipCode = zipCode;
        return this;
    }



class UserDemo {
    public void main(String args[])
    {
        User user1 = new User();
        User user2 = new User();

        user1.setName("Jose").setEmailAddress("jose123@gmail.com").setAge(30).setAddress("Maria de Molina 20").setCity("Madrid").setZipCode("3342");
        user1.setName("Maria").setEmailAddress("maria123@gmail.com").setAge(22).setAddress("Velazquez 14").setCity("Madrid").setZipCode("3342");

        System.out.println(user1);
        System.out.println(user2);
    }
}




}
