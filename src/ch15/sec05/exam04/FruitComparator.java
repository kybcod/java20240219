package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

    Comparator<Fruit> comparator = (o1, o2) -> o1.getPrice() - o2.getPrice();

    @Override
    public int compare(Fruit o1, Fruit o2) {

//        if (o1.price < o2.price) return -1;
//        else if (o1.price == o2.price) return 0;
//        else return 1;

        return comparator.compare(o1, o2);
    }
}
