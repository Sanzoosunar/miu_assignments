package assignment1;

public class Prog6 {
    public static void main(String[] args) {
        int minVal=min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22});
        System.out.println(minVal);
    }

    public static int min(int[] arrayOfInts){
        int min=arrayOfInts[0];
        for(int i=1;i<arrayOfInts.length;i++){
            if(arrayOfInts[i]<min)
                min=arrayOfInts[i];
        }
        return min;
    }
}
