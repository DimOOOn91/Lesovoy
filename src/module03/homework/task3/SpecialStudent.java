package module03.homework.task3;

class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    long getSecretKey() {
        return secretKey;
    }

    void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

}
