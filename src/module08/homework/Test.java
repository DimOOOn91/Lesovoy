package module08.homework;

public class Test implements Identity, Comparable<Test> {
    long id;

    public Test(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Test{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Test test) {
        return Long.compare(this.getId(), test.getId());
    }
}
