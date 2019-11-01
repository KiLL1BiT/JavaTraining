package main.java.com.itechart.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users = new ArrayList<>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(String username) {
        for(User user: users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }

        return null;
    }
}
