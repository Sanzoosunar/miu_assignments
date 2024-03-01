package assignment3;

public class Question1 {
    public static void main(String[] args) {
        reverseNum(453);
    }

    public static void reverseNum(int num){
        if(num<0){
            num=-num;
            System.out.print("-");
        }
        reverse(num);
    }

    public static void reverse(int num){
        if(num==0)
            return;

       System.out.print(num%10);
       reverse(num/10);
    }

    /*
    * Stack Representation

    *                     reverseNum(0)
    * 21                  reverseNum(4)  = 4
    * 21                  reverseNum(45) = 5
    * 21                  reverseNum(453)= 3
    * 5                   main()
    * Line Number       Run time stack
    * */
}
