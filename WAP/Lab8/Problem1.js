function LinkedList(){
    let data=[];
    this.add=function(num){
        data.push(num);
    }
    this.remove=function(num){
        data=data.filter((element)=>element!=num);
    }
    this.print=function(){
        console.log(data);
    }
}
let linkedlist = new LinkedList();
linkedlist.add(1);
linkedlist.add(2);
linkedlist.add(3);
linkedlist.print();
linkedlist.remove(2);
linkedlist.print();
