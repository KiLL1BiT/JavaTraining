package main.java.com.itechart.lesson3;

import java.util.List;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {

        Bank bank = init();


        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();
        User user = null;
        if (bank.getUser(name) != null) {
            user = bank.getUser(name);
            System.out.println("Hi " + name);
        } else {
            System.out.println("Ты пидор");
        }

        System.out.println("Choose your balance");
        List<BankBalance> bankBalances = user.getUserAccount().getBankBalances();
        for (int i = 0; i < bankBalances.size(); i++) {
            System.out.println(i + bankBalances.get(i).getName());
        }
        Integer kek = in.nextInt();
        BankBalance balance = bankBalances.get(kek);


        while (true) {
            System.out.println("Choose operation");
            // напиши тут свитч
            Double value = in.nextDouble();
            System.out.println(balance.addMoney(value));
        }

    }


    //кого? чего?
    private static Bank init() {
        BankBalance usdBalance = new BankBalance("Obema", Currency.USD);
        BankBalance rubBalance = new BankBalance("Putin", Currency.RUB);

        Account userAccount = new Account();
        userAccount.addBankBalances(usdBalance);
        userAccount.addBankBalances(rubBalance);

        User user = new User("Vlad", userAccount);
        Bank bank = new Bank("Hryoryeu's bank");
        bank.addUser(user);
        return bank;
    }
}
