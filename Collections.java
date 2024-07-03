import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        printwords();
    }

    public static void printwords() {
        String[] words = {"Слово", "Привет", "Машина", "Коллекция", "Механизм",
                "Палка", "Кость", "Череп", "Петух", "Слон", "Кот", "Собака",
                "Кость", "Слово", "Автомобиль", "Шепард", "Морриган", "Слон", "Череп", "Человек"};
        Set<String> uniquewords = new HashSet<>();
        for(String word : words) {
            uniquewords.add(word);
        }
        for (String uniqueword : uniquewords) {
            System.out.println(uniqueword);
        }
        Map<String, Integer> Count = new HashMap<>();
        for (String word : words) {
            Count.put(word, Count.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : Count.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а).");
        }
    }
}
