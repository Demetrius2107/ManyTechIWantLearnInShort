package com.lip.cin;

import java.util.Scanner;

/**
 * @author: Elon
 * @title: ScannerStandrand
 * @projectName: ScannerPractice
 * @description: TODO
 * @date: 2025/3/13 9:45
 */
public class ScannerStandrand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("line \n:" + line);
        }
        scanner.close();
    }
}
