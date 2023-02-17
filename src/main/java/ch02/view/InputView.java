package ch02.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public static String readNumber() {
        System.out.print("숫자를 입력하세요: ");
        return sc.nextLine();
    }
}
