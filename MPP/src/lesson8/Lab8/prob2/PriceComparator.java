package lesson8.Lab8.prob2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        return (int) (p1.getPrice() - p2.getPrice());
    }
}
