import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4583,4,2,4,5,346,457,4);

        TreeSet<Integer> treeSet = new TreeSet<>(list);
        for(Integer i: treeSet) {
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Ivan", "Ivan", "Olga", "Olga", "Petr", "Oleg", "Alex");

        TreeSet<String> treeNames = new TreeSet<>(names);
        for(String s: treeNames) {
            System.out.println(s);
        }
        // Задача 1
        // Создать список из кастомных объектов (Объект из двух полей)
        // Создать TreeSet на основе этого списка
    }
}