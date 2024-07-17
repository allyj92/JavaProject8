package typecasting;

public class Quiz {
    public static void main(String[] args) {


    }
}

class Parents{
    String nationality;
    String lastName;

    public Parents(String nationality, String lastName) {
        this.nationality = nationality;
        this.lastName = lastName;
    }
}

class Child extends Parents{
    String firstName;

    public Child(String nationality, String lastName, String firstName) {
        super(nationality, lastName);
        this.firstName = firstName;
    }
}
