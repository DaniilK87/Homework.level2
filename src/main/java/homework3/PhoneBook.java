package homework3;


import java.util.*;


public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(222, "Петров");
        map.put(111, "Иванов");
        map.put(333, "Иванов");
        map.put(444, "Сидоров");
        System.out.println(map);
        TreeMap<Integer, String> map1 = new TreeMap<>();
        System.out.println("Введите номер пользователя и фамилию");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int PhoneNumber = scanner.nextInt();
            String name = scanner.nextLine();
            map.put(PhoneNumber, name);
        }
        map.putAll(map1);
        System.out.println(map);
        System.out.println("Введите номер для поиска абонента");
        int SearchNumber = scanner.nextInt();
        if (map.containsKey(SearchNumber)) {
            System.out.println(map.get(SearchNumber));
        }else {
            System.out.println("Такого абонента нет");
        }


        WordArray wordArray = new WordArray();
        wordArray.WordArray();
    }

}






