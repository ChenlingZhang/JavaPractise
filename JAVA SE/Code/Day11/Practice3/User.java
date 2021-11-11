package Day11.Practice3;

public class User {
    private String userFilter;
    private int id;

    public User(int id, String userFilter) {
        this.userFilter = userFilter;
        this.id = id;
    }

    public String getUserFilter() {
        return userFilter;
    }

    public void setUserFilter(String userFilter) {
        this.userFilter = userFilter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getId()+"-"+getUserFilter();
    }
}
