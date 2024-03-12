package assignment8.prob3;

import assignment5.question5.Computer;

import java.util.*;

public class Marketing {
    String employeeName;
    String productName;
    double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString(){
        return "Marketing{employeeName = "+employeeName+"," +
                "productName = "+productName+","+
                "salesAmount = "+ salesAmount +"}";
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Marketing marketing = (Marketing) obj;
        return employeeName.equals(marketing.employeeName) &&
                productName.equals(marketing.productName) &&
                salesAmount==marketing.salesAmount;
    }

    @Override
    public int hashCode(){
        return Objects.hash(employeeName,productName,salesAmount);
    }
    public static void sortBySalesAmount(List<Marketing> list) {
        Collections.sort(list, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.salesAmount, m2.salesAmount);
            }
        });
    }

    public static void sortByEmpName(List<Marketing> list) {
        Collections.sort(list, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return m1.employeeName.compareTo(m2.employeeName);
            }
        });
    }

    public static List<Marketing> getEmployeeAbove1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.salesAmount > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Marketing> list=new ArrayList<>();
        list.add(new Marketing("Alex Boman","Lipstick",12_000));
        list.add(new Marketing("Frank Williamsam","Foundation",15_000));
        list.add(new Marketing("Emma Smith", "Mascara", 800));
        list.add(new Marketing("David Johnson", "Eyeliner", 1200));
        list.add(new Marketing("Samantha Karki","Sunblock cream",8_500));
        list.add(new Marketing("Yogendra Paudel","Moisterizer",13_200));
        list.add(new Marketing("Ibraham hussain","Face Powder",8_900));
        list.add(new Marketing("Sophia Martinez", "Blush", 700));
        list.add(new Marketing("Michael Davis", "Concealer", 3200));
        list.add(new Marketing("Olivia Brown", "Bronzer", 760));

        list.remove(2);
        list.remove(5);

        System.out.println(list.size());
        sortBySalesAmount(list);

        //print marketing list after sorting with sales amount
        for (Marketing l:list){
            System.out.println(l);
        }

        List<Marketing> list1=getEmployeeAbove1000(list);
        sortByEmpName(list1);

        System.out.println("\n\n");
        //print marketing list of sales above 1000 after sorting with employee name
        for (Marketing l:list1){
            System.out.println(l);
        }
    }
}
