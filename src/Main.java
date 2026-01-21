import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList rainbowСolors = new LinkedList();
        rainbowСolors.add("Красный");
        rainbowСolors.add("Оранжевый");
        rainbowСolors.add("Жёлтый");
        rainbowСolors.add("Зелёный");
        rainbowСolors.add("Голубой");
        rainbowСolors.add("Синий");
        rainbowСolors.add("Фиолетовый");

        ListIterator iterator = rainbowСolors.listIterator();
        System.out.println("Список итераторов в прямом направлении:");
        while (iterator.hasNext()) {
            System.out.println("Индекс = " + iterator.nextIndex() + ", Элемент = " + iterator.next());
        }


    }
}
