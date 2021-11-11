package Day11.Practice3;

public class Client {
    Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void setUser(User u){
        if (u.getUserFilter() != null){
            return;
        }
        if (filter != null){
            filter.filter(u);
        }
        else {
            u.setUserFilter("A");
        }
    }
}
