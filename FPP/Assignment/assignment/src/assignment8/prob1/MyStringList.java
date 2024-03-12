package assignment8.prob1;

import java.util.Arrays;

/* custom array list */
public class MyStringList {
    private final int INITIAL_LENGTH=4;
    private Person[] currentArray;
    private int numOfElements;
    MyStringList(){
        currentArray=new Person[INITIAL_LENGTH];
        numOfElements=0;
    }

    public void add(Person s){
        if(s==null) return;
        if(numOfElements==currentArray.length){
            resize();
        }
        currentArray[numOfElements]=s;
        numOfElements=numOfElements+1; // or numOfElements++
    }
    private void resize(){
        System.out.println("resizing");
        int len=currentArray.length;
        int newLen=2*len;
        Person[] newArray=new Person[newLen];
        System.arraycopy(currentArray,0,newArray,0,len);
        currentArray=newArray;
    }

    public void add(Person person,int pos){
        if(person==null) return;
        if(pos>numOfElements || pos<0) return;

        if(numOfElements==currentArray.length)
            resize();

        Person[] temp=new Person[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,pos);
        temp[pos]=person;
        System.arraycopy(currentArray,pos,temp,pos+1,currentArray.length-(pos+1));
        currentArray=temp;
        ++numOfElements;
    }

    public Person get(int i){
        if(i>=numOfElements || i<0) return null;

        return currentArray[i];
    }



    public boolean isEmpty(){
        return numOfElements==0;
    }
    public int getIndexByLastName(String lastName){
        if(lastName == null) return -1;

        for(int i=0;i<numOfElements;i++){
            if(currentArray[i].getLast().equals(lastName)){
                return i;
            }
        }
        return -1;
    }

    public boolean find(String lastName){
        int index=getIndexByLastName(lastName);
        return index>=0;
    }
    public boolean remove(String lastName){
        int index=getIndexByLastName(lastName);
        if(index==-1) return false;

        Person[] temp=new Person[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,index);
        System.arraycopy(currentArray,index+1,
                temp,index,
                currentArray.length-(index+1));
        currentArray=temp;
        --numOfElements;
        return true;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        for (int i=0;i<numOfElements-1;++i){
            sb.append("{"+
                        currentArray[i].toString()+
                     "},"
                    );
        }
        sb.append("{"+
                    currentArray[numOfElements-1].toString()+
                "}" +
             "]");
        return sb.toString();
    }

    public int size(){return numOfElements;}

    public Object clone(){
        Person[] temp= Arrays.copyOf(currentArray,numOfElements);
        return temp;
        // or return Arrays.copyOf(currentArray,numOfElements);
    }

    public static void main(String[] args) {
        MyStringList l=new MyStringList();
        l.add(new Person("Sunar","Sanjukta",28));
        l.add(new Person("Hinsta","Asmina",25));
        l.add(new Person("Weldetensae","Luwam",24) , 1);
        l.add(new Person("Nansamba","Carolyn",29) , 0);
        System.out.println(l.toString());

        System.out.println("\n");
        System.out.println("Find: "+l.find("Sunar"));
        System.out.println("At index 3 : " + l.get(3));

        l.remove("Nansamba");
        l.remove("Hinsta");

        System.out.println("\n");
        System.out.println(l.toString());
    }
}

