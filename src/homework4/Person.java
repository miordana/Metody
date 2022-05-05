package homework4;

public class Person {
    public static void main(String[] args) {
        String name = "Victoria";
        String surname = "Grabyan";
        String town = "Odessa";
        int number = 380634578;

        String firstPerson = person(name, surname, town, number);
        String secondPerson = person("Ilona", "Palamarchuk", "Kyiv", 380671238);
        String thirdPerson = person("Olena", "Syshkina", "Lviv", 380931234);
        String fourthPerson = person("Amira", "Zaher", "Artcyz", 380661234);
        System.out.println(firstPerson);
        System.out.println();
        System.out.println(secondPerson);
        System.out.println();
        System.out.println(thirdPerson);
        System.out.println();
        System.out.println(fourthPerson);

    }

    public static String person(String name, String surname, String town, int number) {
    return "Name: " + name + "\nsurname: " + surname + "\ntown: " + town + "\nint number: " + number;

    }
}
