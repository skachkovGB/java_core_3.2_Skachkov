package lesson04_homework.part_two;

public class SecondTask {
    public static void main(String[] args) {
        PhoneBook firstPhoneBook = new PhoneBook();
        System.out.println("Phones for 2name: " + firstPhoneBook.get("2name"));
        System.out.println("Phones for 1name: " + firstPhoneBook.get("1name"));

        firstPhoneBook.add("9name","99-99");
        System.out.println("Phones for 9name: " + firstPhoneBook.get("9name"));
        System.out.println("Phones for 10name: " + firstPhoneBook.get("10name"));

    }

}
