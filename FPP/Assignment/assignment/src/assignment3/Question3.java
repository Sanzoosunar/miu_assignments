package assignment3;

import java.lang.reflect.Array;

public class Question3 {
    public static void main(String[] args) {
        int[] a = {9, 10, 1};
        int sum = sumOfArrElement(a, 0);
        System.out.println(sum);
    }

    public static int sumOfArrElement(int[] array,int index){
        if(array==null || index==array.length)
            return 0;

        return array[index]+sumOfArrElement(array,index+1);
    }
}
