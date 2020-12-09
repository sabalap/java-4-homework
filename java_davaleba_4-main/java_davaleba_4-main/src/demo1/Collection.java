package demo1;

import java.util.HashSet;


public class Collection {
    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Gio");
        hashSet.add("Luka");
        hashSet.add("Mariami");
        hashSet.add("Lika");
        hashSet.add("Nikolozi");
        hashSet.add("Nikolozi");
        hashSet.add("Nikusha");

        System.out.println("სახელები : ");
        for (String names : hashSet) {
            System.out.println(names);
        }

    }
}