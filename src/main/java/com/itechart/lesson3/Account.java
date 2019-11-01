package main.java.com.itechart.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private List<BankBalance> bankBalances = new ArrayList<>();

    public List<BankBalance> getBankBalances() {
        return bankBalances;
    }

    public void addBankBalances(BankBalance bankBalance) {
        bankBalances.add(bankBalance);
    }
}
