public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public String toString() {
        return lastName + ", " + firstName + " (" + home + ")";
    }
}
