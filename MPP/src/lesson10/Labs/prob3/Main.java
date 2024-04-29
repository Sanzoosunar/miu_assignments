package lesson10.Labs.prob3;


import lesson9.labs.prob7a.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Bob","Tom","Joe");
        System.out.println(contains(lst,"Tom"));
    }
    public static <T> boolean contains(List<T> list, T s){
        for (T x:list){
            if(x==null && s==null)
                return true;
            if(s==null || x==null)
                continue;

            if (x.equals(s))
                return true;
        }
        return false;
    }
}
