package lesson9.labs.prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));

    public static boolean isVegetarianMealAvailable(){
        return menu.stream()
                .anyMatch(Dish::isVegetarian);
    }

    public static boolean isHealthyMenuAvailable() {
        return  menu.stream()
                .mapToInt(Dish::getCalories)
                .anyMatch(calories -> calories < 1000);
    }

    public static boolean isUnhealthyMenuAvailable() {
        return  menu.stream()
                .mapToInt(Dish::getCalories)
                .anyMatch(calories -> calories > 1000);
    }

    public static Optional<Dish> firstItemOfTypeMeat(){
        return  menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .findFirst();
    }

    public static int calculateTotalCalories(){
        return  menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, (x,y)-> x+y);
    }

    public static int calculateTotalCaloriesMethodReference(){
        return  menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        //a. Is there any Vegetarian meal available ( return type boolean)
        System.out.println("[+] isVegetarianMealAvailable: " + Dish.isVegetarianMealAvailable());

        //b. Is there any healthy menu have calories less than 1000 ( return type boolean)c.
        System.out.println("[+] isHealthyMenuAvailable: " + Dish.isHealthyMenuAvailable());

        //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
        System.out.println("[+] isUnhealthyMenuAvailable: " + Dish.isUnhealthyMenuAvailable());

        //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
        System.out.println("[+] First Item of Type meat dish: " + firstItemOfTypeMeat().orElse(null));

        //e. calculateTotalCalories() in the menu using reduce. (return int)
        System.out.println("[+] Total calories in the menu(using lambda): " + calculateTotalCalories());

        //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
        System.out.println("[+] Total calories in the menu(using method reference): " + calculateTotalCaloriesMethodReference());

        //e. Implement a main method to test.
    }
}