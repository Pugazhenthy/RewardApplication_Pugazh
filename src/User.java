import java.util.List;

public class User {
    String userame;
    String password;
    static int points;
    List<Reward> rewards;

    public User(String userame, String password) {
        super();
        this.userame = userame;
        this.password = password;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getPoints(String userame) {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

}
