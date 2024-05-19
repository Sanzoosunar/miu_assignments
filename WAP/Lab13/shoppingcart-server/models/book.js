
const books=[];
let id=1;
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
    addBook(){
        this.id=id++;
        books.push(this);
    }
    updateBook(id){
        this.id=id;
    }
}