import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    private Map<String, List<String>> phoneBook;

    public Phone() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }
}
