package main.java.com.itechart.lesson3;

public class User {

    private String name;

    private final Account userAccount;

    public User(String name, Account userAccount) {
        this.name = name;
        this.userAccount = userAccount;
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
