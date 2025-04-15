package com.lip.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCalculation {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 加上 90 天
        LocalDate newDate = currentDate.plusDays(90);

        // 定义日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 将日期转换为字符串
        String dateString = newDate.format(formatter);

        // 输出结果
        System.out.println("当前日期加 90 天后的日期是: " + dateString);
    }
}    