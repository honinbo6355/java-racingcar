package util;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner scanner;

    public ScannerUtil() {
        this.scanner = new Scanner(System.in);
    }
    public int getIntByInputMessage(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public String[] getStrArrByInputMessage(String message) {
        System.out.println(message);
        return scanner.next().split(",");
    }
}
