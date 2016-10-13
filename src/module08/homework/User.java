package module08.homework;

public class User implements Identity<User> {
    private long id = 0;
    private String name;

    public User(String name) {
        this.id = ++id ;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }
}
