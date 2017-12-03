package ru.vicgoy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        String exit = " ";
        Pattern pattern = Pattern.compile("[\\-\\+\\*\\\]+");

        System.out.println("Добро пожаловать в калькулятор");
        while (!exit.equalsIgnoreCase("exit")) {
            System.out.println("Введите числа");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            scanner.close();
            if (input.contains("+")) {
                List<String> list = new ArrayList<>();
                //list.add();
                System.out.println("");
            }
        }

        // write your code here
    }
}
