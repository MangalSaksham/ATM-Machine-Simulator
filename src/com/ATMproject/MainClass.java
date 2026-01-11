package com.ATMproject;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter ATM Number: ");
        int Number = input.nextInt();
        System.out.print("Enter ATM Pin: ");
        int pin = input.nextInt();

        if (atmNumber == Number && atmPin == pin) {
            while (true) {
                System.out.println("1.View Available Balance \n2.Withdraw Amount\n3.Deposit Amount\n" +
                        "4.View MiniStatement\n5.Exit ");
                System.out.print("Enter Choice: ");
                int ch = input.nextInt();

                if (ch == 1) {
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.print("Enter Amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.print("Enter Amount to Deposit :");
                    double depositAmount = input.nextDouble(); //5000
                    op.depositAmount(depositAmount);

                }else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect your ATM Card\n Thank You for using ATM Machine !!!");
                    System.exit(0);

                } else {
                    System.out.println("Please Enter Correct Choice");
                }

            }
        } else {
            System.out.println("Incorrect ATM Number or ATM Pin");
            System.exit(0);
        }
    }
}
