import java.util.List;
public class Main {
    public static void main(String[] args) {
        Phone phoneBook  = new Phone();
        phoneBook.add("Иванов", "+7 (123) 456-7890");
        phoneBook.add("Петров", "+7 (987) 654-3210");
        phoneBook.add("Иванов", "+7 (111) 222-3333");
        String name = "Иванов";
        List<String> phoneNumbers = phoneBook.get(name);
        if (!phoneNumbers.isEmpty()) {
            System.out.println("Номера телефонов для фамилии " + name + ":");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
        } else {
            System.out.println("Нет записей для фамилии " + name);
        }
    }
}
