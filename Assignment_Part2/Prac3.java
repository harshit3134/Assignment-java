
/*
21CE001_Harshit Ajakiya
Use the Account class created as above to simulate an ATM machine.
        Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The
        system prompts the users to enter an id. If the id is entered incorrectly, ask
        the user to enter a correct id. Once an id is accepted, display menu with
        multiple choices.
        1. Balance inquiry
        2. Withdraw money [Maintain minimum balance 300₹]
        3. Deposit money
        4. Money Transfer
        5. Create Account
        6. Deactivate Account
        7. Exit
        Hint: Use ArrayList, which is can shrink and expand with compared to Array.*/
import java.util.*;

class Accoutn1 {
    public String id;
    double balance = 300;

    Accoutn1() {
    }

    public Accoutn1(String s) {
        id = s;
    }
}

public class Prac3 {
    public static void main(String[] args) {
        Accoutn1[] acc = new Accoutn1[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            acc[i] = new Accoutn1();
            acc[i] = new Accoutn1("AC" + i);
            System.out.println(acc[i].id + " 100 ");
        }
        int k = 0;
        int l = 0;
        int j;
        do {
            System.out.println("Enter valid ID number");
            String t = sc.next();
            for (j = 1; j <= 10; j++) {
                if (t.equals(acc[j].id)) {
                    k++;
                    break;
                } else {
                }
            }
            if (k == 0) {
            } else {
                l = 1;
            }
        } while (l != 1);
        System.out.println("Hello");
        System.out.println("Enter 1 for balance");
        System.out.println("Enter 2 for withdraw");
        System.out.println("Enter 3 for deposit");
        System.out.println("Enter 4 for money transfer");
        System.out.println("Enter 5 for create account");
        System.out.println("Enter 6 for deactivate account");
        System.out.println("Enter 7 for exiting");
        int x = sc.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println(acc[2].balance);
            }
            case 2 -> {
                int s = sc.nextInt();
                acc[j].balance -= s;
                System.out.println(acc[2].balance);
            }
            case 3 -> {
                int s = sc.nextInt();
                acc[j].balance += s;
                System.out.println(acc[2].balance);
            }
            case 4 -> {
                int s = sc.nextInt();
                System.out.print("To be transferred in :");
                int i = sc.nextInt();
                acc[i].balance += s;
                acc[j].balance -= s;
                System.out.println(acc[j].balance);
                System.out.println(acc[i].balance);
            }
            case 5 -> {
                acc[11] = new Accoutn1();
                System.out.println("Account created");
            }
            case 6 -> {
                acc[j].balance = 0;
                acc[j].id = "0A";
            }

        }
    }
}