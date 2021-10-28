package task5;

import java.util.List;

public class FillTheSafeWithItems {
    public static List<ItemsForSafe> fillTheSafeWithItems
            (int capacityOfSafe, List<ItemsForSafe> listOfItems ) {

        for (ItemsForSafe a : listOfItems) {

            if (capacityOfSafe < a.getVolumeItem()) {
                continue;
            }
            int res = capacityOfSafe / a.getVolumeItem();
            a.setNumItem(res);

            System.out.println(a.getNameItem() +
                    " в количестве " + res);

            capacityOfSafe = capacityOfSafe % a.getVolumeItem();

            if (capacityOfSafe <= 0) break;
        }
        return listOfItems;
    }
}
