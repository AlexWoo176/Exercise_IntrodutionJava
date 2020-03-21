package usd.vnd;

import java.util.Scanner;

public class UsdVnd {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng tiền USD: ");
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.print("Giá trị quy đổi sang VND: " + exchange);
    }
}
