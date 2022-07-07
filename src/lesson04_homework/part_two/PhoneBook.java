package lesson04_homework.part_two;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public PhoneBook(){
        Abonent abonent1 = new Abonent("1name","11-11");
        this.add(abonent1);
        Abonent abonent2 = new Abonent("2name","22-22");
        this.add(abonent2);
        Abonent abonent3 = new Abonent("3name","33-33");
        this.add(abonent3);
        Abonent abonent4 = new Abonent("4name","44-44");
        this.add(abonent4);
        Abonent abonent5 = new Abonent("1name","11-11-11");
        this.add(abonent5);
        Abonent abonent6 = new Abonent("5name","55-55");
        this.add(abonent6);
        Abonent abonent7 = new Abonent("1name","11-11-1");
        this.add(abonent7);
        Abonent abonent8 = new Abonent("3name","33-33");
        this.add(abonent8);

    }

    public void add(String name, String number){
        this.phoneBook.put(number,name);
    }

    public void add(Abonent abonent){
        this.phoneBook.put(abonent.getNumberAbonent(),abonent.getNameAbonent());
    }

    public String get(String name){
        String searchNumber = "";
        for (Map.Entry<String,String> pair : phoneBook.entrySet()){
            if(name.equals(pair.getValue())){
                searchNumber =  pair.getKey() + "; " + searchNumber;
            }

        }
        return searchNumber;
    }


}
