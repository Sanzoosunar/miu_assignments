package assignment3;

public class Question2 {
    public static void main(String[] args) {
        int count=countDigit(342);
        System.out.print(count);
    }

    public static int countDigit(int num){
        if(num==0)
            return 0;

        return 1+countDigit(num/10);
    }

    /*
    *  * Stack Representation

     *                     countDigit(0) = 0
     * 13                  countDigit(3)  = 1+countDigit(0) =  1+0=1
     * 13                  countDigit(34) = 1+countDigit(3) =  1+1=2
     * 13                  countDigit(342)= 1+countDigit(34) = 1+2=3
     * 5                   main()
     * Line Number       Run time stack
     * */
}
