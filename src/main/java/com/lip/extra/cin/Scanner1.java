package com.lip.extra.cin;

import java.util.Scanner;

/**
 * @author: Elon
 * @title: Scanner1
 * @projectName: ScannerPractice
 * @description: Scanner用法训练
 * @date: 2025/3/13 9:39
 */
public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println("num : " + num);

        String str = scanner.next();
        System.out.println("string : " + str);


        // 消耗掉字符串输入后的换行符
        scanner.nextLine();

        // 读取一行字符串1
        String line = scanner.nextLine();
        System.out.println("line :" + line);

        scanner.close();
    }
}
