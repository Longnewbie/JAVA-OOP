package OOP2.BookAndAuthors;

public class Authors {
    private String name, email;
    private char gender;

    public Authors(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Name : " + name + "\n" + 
               "Email : " + email + "\n" + 
               "Gender : " + gender;
    }
}