package lesson9.labs.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public int countWords(List<String> words,
                          char c,
                          char d,
                          int len){

        return   (int) words.stream()
                .filter(w-> w.length() == len)
                .filter(w-> w.contains(Character.toString(c)))
                .filter(w-> !w.contains(Character.toString(d)))
                .count();
    }

    public static void main(String[] args) {
        Main m = new Main();

        List<String> stringList = Arrays.asList("In this comprehensive guide", "we’ve", "explored", "the ins and outs of creating",
                "manipulating","and using lists of", "strings", "niques", "to help you",
                "handle", "lists", "effectively", "in",  "you",  "Java programs");

        System.out.println("count words: " + m.countWords(stringList, 'u', 'z', 6));
    }
}
