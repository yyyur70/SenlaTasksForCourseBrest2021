package task5;

import java.util.Objects;

public class ItemsForSafe {
    private String nameItem;
    private int volumeItem;
    private int costItem;
    private double valueItem;
    private int numItem = 0;


    public ItemsForSafe(String nameItem, int volumeItem, int costItem) {
        this.nameItem = nameItem;
        this.volumeItem = volumeItem;
        this.costItem = costItem;
        this.valueItem = getValueItem();
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getVolumeItem() {
        return volumeItem;
    }

    public void setVolumeItem(int volumeItem) {
        this.volumeItem = volumeItem;
    }

    public int getCostItem() {
        return costItem;
    }

    public void setCostItem(int costItem) {
        this.costItem = costItem;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemsForSafe)) return false;
        ItemsForSafe task = (ItemsForSafe) o;
        return getVolumeItem() == task.getVolumeItem() && getCostItem() == task.getCostItem() && getValueItem() == task.getValueItem() && getNumItem() == task.getNumItem() && Objects.equals(getNameItem(), task.getNameItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameItem(), getVolumeItem(), getCostItem(), getValueItem(), getNumItem());
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameItem='" + nameItem + '\'' +
                ", volumeItem=" + volumeItem +
                ", costItem=" + costItem +
                ", valueItem=" + valueItem +
                ", кол-во положенных предметов = " + numItem +
                '}';
    }

    public double getValueItem() {
        valueItem = (double) costItem / volumeItem;
        return valueItem;
    }
}
