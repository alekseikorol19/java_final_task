package java_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("DEXP C15-ICP301", 15, 8, 256, "windows", "grey");
        Laptop laptop2 = new Laptop("MAIBENBEN P455", 14, 8, 256, "windows", "white");
        Laptop laptop3 = new Laptop("MACBOOK AIR M3", 15, 8, 256, "mac", "gold");

        List<Laptop> laptop_list = new ArrayList<>();
        
        laptop_list.add(laptop1);
        laptop_list.add(laptop2);
        laptop_list.add(laptop3);

        Map<Integer, String> user_input_map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите МИНИМАЛЬНОЕ значение диагонали экрана (Дюйм): ");
        String usr_desktop_size = scanner.nextLine();
        

        user_input_map.put(1, usr_desktop_size);

        System.out.println("Введите МИНИМАЛЬНОЕ значение оперативной памяти (ГБ): ");
        String usr_ram_vol = scanner.nextLine();
        
        user_input_map.put(2, usr_ram_vol);

        System.out.println("Введите МИНИМАЛЬНОЕ значение объема жесткого диска (ГБ): ");
        String usr_ssd_vol = scanner.nextLine();

        user_input_map.put(3, usr_ssd_vol);

        System.out.println("Введите предпочтительную ОС: ");
        String usr_pref_os = scanner.nextLine();

        user_input_map.put(4, usr_pref_os);

        scanner.close();

        for (Laptop laptop : laptop_list) {
            if (laptop.getDesktop_size() >= Integer.parseInt(user_input_map.get(1))) {
                if (laptop.getRam_vol() >= Integer.parseInt(user_input_map.get(2))) {
                    if (laptop.getSsd_vol() >= Integer.parseInt(user_input_map.get(3))) {
                        if (laptop.getOper_system().toLowerCase().trim() == user_input_map.get(4).toLowerCase().trim()) {
                            System.out.println("Поздравляю! Вам подходит: " + laptop.getName());
                            break;
                        }
                    }
                }
            }
            System.out.println(laptop.getName() + " вам не подходит.");
        }

    }
}
