package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SafeWithItems {
    public static void main(String[] args) {
        int capacityOfSafe = 500026;

        List<ItemsForSafe> listOfItems = new ArrayList<>();
        listOfItems.add(new ItemsForSafe("Элемент 1", 114, 15));
        listOfItems.add(new ItemsForSafe("Элемент 2", 205, 6200));
        listOfItems.add(new ItemsForSafe("Элемент 3", 179, 10000));
        listOfItems.add(new ItemsForSafe("Элемент 4", 154, 7500));
        listOfItems.add(new ItemsForSafe("Элемент 5", 79, 1500));

        List <ItemsForSafe> sortedListOfItems = listOfItems.stream()
                .sorted(Comparator.comparingDouble(ItemsForSafe::getValueItem).reversed())
                .collect(Collectors.toList());

        List<ItemsForSafe> listOfItemsRes = new ArrayList<>(FillTheSafeWithItems.fillTheSafeWithItems(capacityOfSafe,sortedListOfItems));
        listOfItemsRes.forEach(System.out::println);
    }
}
