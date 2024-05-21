package java_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("DEXP C15-ICP301", 15, 8, 256, "windows", "grey");
        Laptop laptop2 = new Laptop("MAIBENBEN P455", 14, 8, 256, "windows", "white");
        Laptop laptop3 = new Laptop("MACBOOK AIR M3", 15, 8, 256, "mac", "gold");

        Map<Integer, String> user_input_map = new HashMap<>();
        Scanner scanner = new Scanner();
        System.out.println("Введите МИНИМАЛЬНОЕ значение диагонали экрана: ");
        String usr_desktop_size = scanner.nextLine();


    }
}
