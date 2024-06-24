public class Employee {
    public String name;
    public String position;
    public String email;
    public int number;
    public int salary;
    public int age;

    public Employee(String _name, String _position, String _email, int _number, int _salary, int _age) {
        System.out.println("Info");
        setValue(_name, _position, _email, _number, _salary, _age);
        System.out.println(getValue());

    }

    public void setValue(String _name, String _position, String _email, int _number, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        number = _number;
        salary = _salary;
        age = _age;
    }

    public String getValue() {
        return "Employee: " + name + position + email + number + " " + salary + " " + age;
    }
}


