package main.java.com.itechart.lesson3;

public class BankBalance {

    private Currency currency;

    private Double balance;

    private String name;

    public BankBalance(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BankBalance(String name, Currency currency) {
        this.currency = currency;
        this.name = name;
        this.balance = 0.0;
    }

    public String checkBalance() {
        return "Current balance " + balance + currency.getName();
    }

    public String withdrawMoney(Double money) {
        if (money >= balance) {
            balance = 0.0;
            return "Value > balance, current balance is " + balance;
        } else {
            balance = balance - money;
            return "" + balance;
        }
    }

    public String addMoney(Double money) {
        balance = balance + money;
        return "Money are successfully added, current balance is " + balance;
    }

    public String getName() {
        return name;
    }
}
