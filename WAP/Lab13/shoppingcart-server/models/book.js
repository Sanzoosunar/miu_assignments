
const books=[];
module.exports= class Book{
    constructor(id,title,ISBN,publishedDate,author){
        this.id=id;
        this.title=title;
        this.ISBN=ISBN;
        this.publishedDate=publishedDate;
        this.author=author;
    }

    static getBooks(){
        return books;
    }
    static getBookById(id){
        return books.find(a=>a.id===id);
    }
    add(){
        this.id=books.length+1;
        books.push(this);
        return this;
    }
    update(id){
        const index=books.findIndex(a=>a.id===id);
        if(index==-1){
            throw new Error("book not found")
        }
        this.id=id;
        books[index]=this;
        return this;
    }
    static delete(id){
         const index=books.findIndex(a=>a.id===id); 
         if(index==-1){
            throw new Error("book not found")
        }  
        const tmp=books[index];
        books.splice(index,1);
        return tmp;
    }
}