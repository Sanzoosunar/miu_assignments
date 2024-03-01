package assignment1;

import java.lang.reflect.Array;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = { 3,8,9,11};
        int[] combinedArray = combine(a,b);

        System.out.print("[");
        for (int i=0;i<combinedArray.length;i++){
            if(i>0)
                System.out.print(",");

            System.out.print(combinedArray[i]);

        }
        System.out.print("]");
    }

    public static int[] combine(int[]a,int[]b){
        int lenA=a.length;
        int lenB=b.length;
        int[] combinedArray = new int[lenA+lenB];

        System.arraycopy(a,0,combinedArray,0,lenA);
        System.arraycopy(b,0,combinedArray,lenA,lenB);
        return combinedArray;
    }
}
