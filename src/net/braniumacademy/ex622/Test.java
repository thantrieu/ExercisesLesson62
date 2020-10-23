package net.braniumacademy.ex622;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("0021000875896");
        BankAccount account2 = new BankAccount("0021000585899");
        var input = new Scanner(System.in);
        // nạp tiền vào tài khoản
        try {
            deposit(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
        // rút tiền
        try {
            widthdraw(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
        // chuyển tiền
        try {
            transfer(account1, account2, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
        // thanh toán hóa đơn
        try {
            payTheBill(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
    }

    /**
     * phương thức nhập vào và thực hiện thanh toán hóa đơn của một
     * tài khoản nào đó nếu đầu vào là hợp lệ
     *
     * @param account1 tài khoản nguồn
     * @param input    đối tượng của lớp Scanner
     * @throws InvalidAmountException ngoại lệ có thể xảy ra khi giao dịch
     */
    private static void payTheBill(BankAccount account1, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần thanh toán: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        System.out.println("Số dư ban đầu: " + account1.getBallance());
        try {
            account1.payBill(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    /**
     * phương thức này dùng để thực hiện việc chuyển khoản giữa hai tài khoản A, B
     * việc thực hiện sẽ thành công nếu số tiền hợp lệ và ngược lại
     *
     * @param account1 tài khoản nguồn
     * @param account2 tài khoản đích
     * @param input    đầu vào nhập liệu
     * @throws InvalidAmountException ngoại lệ có thể xảy ra khi giao dịch
     */
    private static void transfer(BankAccount account1,
                                 BankAccount account2, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần chuyển: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        try {
            System.out.println("Số dư ban đầu: " + account1.getBallance());
            account1.transfer(account2, amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    /**
     * phương thức thực hiện việc nhập vào số tiền cần giao dịch
     * và rút số tiền này khỏi tài khoản cho trước
     *
     * @param account1 tài khoản cần rút tiền
     * @param input    đối tượng của lớp Scanner
     * @throws InvalidAmountException ngoại lệ xảy ra nếu số tiền không hợp lệ
     */
    private static void widthdraw(BankAccount account1, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần rút: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        try {
            System.out.println("Số dư ban đầu: " + account1.getBallance());
            account1.withdraw(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    /**
     * phương thức thực hiện việc nhập vào số tiền cần nạp
     * và nạp số tiền đó vào tài khoản nếu hợp lệ
     *
     * @param account1 tài khoản cần nạp
     * @param input    đối tượng của lớp Scanner
     * @throws InvalidAmountException ngoại lệ xảy ra nếu số tiền không hợp lệ
     */
    private static void deposit(BankAccount account1, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần nạp vào tài khoản: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        try {
            System.out.println("Số dư ban đầu: " + account1.getBallance());
            account1.deposit(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }
}
