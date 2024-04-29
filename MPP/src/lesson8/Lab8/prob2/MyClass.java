package lesson8.Lab8.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClass {
	public enum CompareMethod{ PRICE, TITLE, MODEL};

	public void myMethod(List<Product> p){
		System.out.println("Original Product list: ");
		System.out.println(p);
		myCompare(p, CompareMethod.TITLE);
		System.out.println(p);
	}

	public void myCompare(List<Product> p, CompareMethod method){
		class ClosureComparator implements Comparator<Product>{
			@Override
			public int compare(Product p1, Product p2){
				if(method == CompareMethod.TITLE){
					return p1.getTitle().compareTo(p2.getTitle());
				}

				else if(method == CompareMethod.PRICE){
					return (int)(p1.getPrice() - p2.getPrice());
				}else{
					throw new IllegalArgumentException("Can not compare");
				}
			}
		}
		Collections.sort(p, new ClosureComparator());
	}


	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>(){
			{
				add(new Product("Dell-26", 1500.0, 2));
				add(new Product("MSI-26", 990.0, 7));
				add(new Product("HP-26", 450.8, 1));
				add(new Product("MAC-26", 1900.0, 9));
				add(new Product("Google-26", 500.0, 3));

			}
		};

		List<Product> copy = productList;
		MyClass myClass = new MyClass();
		myClass.myMethod(productList);

		List<Product> productList1 = new ArrayList<>(){
			{
				add(new Product("Dell-26", 1500.0, 2));
				add(new Product("MSI-26", 990.0, 7));
				add(new Product("HP-26", 450.8, 1));
				add(new Product("MAC-26", 1900.0, 9));
				add(new Product("Google-26", 500.0, 3));

			}
		};

		System.out.println("Original Product list1: ");
		System.out.println(productList1);
		Collections.sort(productList1, new TitleComparator());
		System.out.println(productList1);

		List<Product> productList2 = new ArrayList<>(){
			{
				add(new Product("Dell-26", 1500.0, 2));
				add(new Product("MSI-26", 990.0, 7));
				add(new Product("HP-26", 450.8, 1));
				add(new Product("MAC-26", 1900.0, 9));
				add(new Product("Google-26", 500.0, 3));

			}
		};

		System.out.println("Original Product list2: ");
		System.out.println(productList2);
		Collections.sort(productList2, new PriceComparator());
		System.out.println(productList2);

		List<Product> productList3 = new ArrayList<>(){
			{
				add(new Product("Dell-26", 1500.0, 7));
				add(new Product("Dell-26", 990.0, 5));
				add(new Product("HP-26", 450.8, 1));
				add(new Product("MAC-26", 1900.0, 9));
				add(new Product("Google-26", 500.0, 3));

			}
		};
		System.out.println("Original Product list3: ");
		System.out.println(productList3);
		Collections.sort(productList3, (p1, p2)->{
			if(p1.getTitle().equals(p2.getTitle())){
				return (p1.getModel() - p2.getModel());
			}else{
				return p1.getTitle().compareTo(p2.getTitle());
			}
		});
		System.out.println(productList3);

	}
}