let books=[
    {
        "bookId": 1,
        "title": "Node.js",
        "author": {
        "authorId": 303,
        "firstname": "Edward",
        "lastname": "Jack"
        }
    },
    {
        "bookId": 2,
        "title": "Angular",
        "author": {
        "authorId": 308,
        "firstname": "John",
        "lastname": "Smith"
        }

    }
];
counter=3;
module.exports=class Book{
    constructor(id,title,author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
    static getAll(firstName=""){
        if(firstName==null)
            firstName="";

        firstName=firstName.toLowerCase();
        return books.filter(a=>a.author.firstname.toLowerCase().includes(firstName));
    }

    static getById(id){
        return books.find(a=>a.bookId===id);
    }

    save(){
        this.id=counter++;
        books.push(this);
        return this;
    }
    update(id){
        const bId=books.findIndex(a=>a.bookId===id);
        if(bId>-1){
            this.bookId=id;
            books[bId]=this;
            return this;
        }
        else{
            throw new Error('book not found for bookId : ',id);
        }
    }
    static delete(id){
        const bId=books.findIndex(a=>a.bookId===id);
        if(bId==-1){
            throw  Error('book not found for bookId : '+id);
        }
        const tmp=books[bId];
        books.splice(bId,1);
        return tmp;
    }
}