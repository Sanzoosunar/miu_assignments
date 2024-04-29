package lesson10.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<? extends Objects> objectsList = new ArrayList<>();
    }
}
