package assignment6;

public class MyTable {
    private Entry[] entries=new Entry[26];
    private class Entry{
        private char index;
        private String value;

        public Entry(char c, String s) {
            this.index = c;
            this.value = s;
        }

        @Override
        public String toString(){
            return this.index+"->"+this.value;
        }
    }

    public void add(char c,String s){
        int index=(int)c-97;
        if(index>=0 && index<=25){
            entries[index]=new Entry(c,s);
            return;
        }
        System.out.println("Invalid character");
    }

    public String get(char c){
        int index=(int)c-97;
        if(index>=0 && index<=25){
            if(entries[index]!=null)
                return entries[index].value;
        }
        return "out of index of or value doesnot exists!";
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Entry entry:entries){
            if(entry!=null){
               result.append(entry.toString()).append('\n');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MyTable table=new MyTable();
        table.add('n',"Narangi");
        table.add('z',"Zehnab");
        table.add('y',"Yadav");
        table.add('t',"Tahir");
        table.add('m',"Marium");
        table.add('b',"Billy");
        table.add('a',"Amber");
        System.out.println(table);

        System.out.println("value for 'u' : " + table.get('u'));
        System.out.println("value for 'b' : " + table.get('b'));
    }
}
