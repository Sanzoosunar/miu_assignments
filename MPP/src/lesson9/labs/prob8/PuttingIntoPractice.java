package lesson9.labs.prob8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("[+] Query 1");
        transactions.stream()
                .filter(x->x.getYear() >= 2011)
                //.sorted((x,y) -> x.getValue() - y.getValue()) /* Lambda way*/
                .sorted(Comparator.comparing(Transaction::getValue)) /* Lambda way*/
                .forEach(System.out::println);

        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("\n[+] Query 2");
        transactions.parallelStream()
                .flatMap(x-> Stream.of(x.getTrader().getCity()))
                .distinct()
                .forEach(System.out::println);


        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("\n[+] Query 2");
        transactions.stream()
                .filter(x->x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("\n[+] Query 4");
        Optional<String> allString = transactions.stream()
                .map(x->x.getTrader().getName())
                .reduce(String::concat);
        System.out.println(allString.get());


        // Query 5: Are there any trader based in Milan?
        System.out.println("\n[+] Query 5");
        Optional<String> isMilan = transactions.stream()
                .map(x->x.getTrader().getCity())
                .filter(x->x.equals("Milan"))
                        .findAny();
        System.out.println(isMilan.get());
        
   
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("\n[+] Query 6");
        transactions.stream()
                .map(transaction -> {
                    if (transaction.getTrader().getCity().equals("Milan")) {
                        transaction.getTrader().setCity("Cambridge");
                    }
                    return transaction;
                })
                .forEach(System.out::println);

        
        // Query 7: What's the highest value in all the transactions?
        System.out.println("\n[+] Query 7");
        Optional<Integer> max = transactions.parallelStream()
                .map(Transaction::getValue)
                .max(Integer::compare);
        System.out.println("max is: " + max.get());


    }
}
