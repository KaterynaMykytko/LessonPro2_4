package org.courses.ex2_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();

        families.put("Oslo", "Mykytko");
        families.put("Kiev", "Shevchenko");
        families.put("London", "Abromovich");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search city:");
        String city = scanner.next();

        String lastName = families.get(city);

        System.out.println(lastName);
    }
}