package assignment2;

public class Prog3 {
    public static void main(String[] args) {
        String[] list=RemoveDups(new String[]{"horse", "dog", "cat", "horse", "dog",null,null});
        for (String l :list)
            System.out.println(l);
    }
    public static String[] RemoveDups(String[] strArr){
        int len=strArr.length;
        if(len==1)
            return strArr;

        String[] newArr=new String[len];
        int count=0;
        int j;
        boolean isExists;

        for(int i=0;i<len;i++){
            if(strArr[i]!=null){
                isExists=false;
                for(j=0;j<count;j++){
                    if(strArr[i].equals(newArr[j])){
                        isExists=true;
                        break;
                    }
                }
                if(!isExists){
                    newArr[count]=strArr[i];
                    count++;
                }
            }
        }
        String[] result = new String[count];
        System.arraycopy(newArr,0,result,0,count);
        return result;
    }
}
