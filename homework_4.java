import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework_4 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // добавление телефона для логина
        addPhone(phoneBook, "user1", "123-456-789");
        addPhone(phoneBook, "user1", "987-654-321");
        addPhone(phoneBook, "user2", "555-555-555");

        // вывод списка телефонов для логина
        System.out.println("Телефоны для пользователя user1: " + findPhones(phoneBook, "user1"));

        // удаление телефона из списка для логина
        removePhone(phoneBook, "user1", "123-456-789");
        System.out.println("Телефоны для пользователя user1 после удаления 123-456-789: " + findPhones(phoneBook, "user1"));
    }

    // добавление телефона для логина
    public static void addPhone(Map<String, List<String>> phoneBook, String login, String phone) {
        if (phoneBook.containsKey(login)) {
            List<String> phones = phoneBook.get(login);
            phones.add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(login, phones);
        }
    }

    // удаление телефона из списка для логина
    public static void removePhone(Map<String, List<String>> phoneBook, String login, String phone) {
        if (phoneBook.containsKey(login)) {
            List<String> phones = phoneBook.get(login);
            phones.remove(phone);
        }
    }

    // нахождение списка телефонов для логина
    public static List<String> findPhones(Map<String, List<String>> phoneBook, String login) {
        if (phoneBook.containsKey(login)) {
            return phoneBook.get(login);
        }
        return new ArrayList<>();
    }
}