public class UserDto {

    private String firstName;
    private String lastName;

    public UserDto(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
