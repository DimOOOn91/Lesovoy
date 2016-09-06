package module03.homework.task3;

class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    String getCollegeName() {
        return collegeName;
    }

    void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    int getRating() {
        return rating;
    }

    void setRating(int rating) {
        this.rating = rating;
    }

    long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

}
