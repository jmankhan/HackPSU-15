package jalal.com.hackpsu;

import java.util.ArrayList;

/**
 * Created by Jalal on 3/28/2015.
 */
public class User {
    private String name;
    private int points;
    private ArrayList<Group> attending;

    public User(String name) {
        this.name = name;
        points = 0;

        attending = new ArrayList<Group>();
    }

    public int getPoints() {
        return this.points;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Increment points by int delta
     * @param delta amount to add onto points. May be negative
     */
    public void addPoints(int delta) {
        this.points += delta;
    }
}
