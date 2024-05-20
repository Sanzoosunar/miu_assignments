const book=require('../models/book');

module.exports.getAll=(req,res)=>{
    res.json(book.getBooks());
}
module.exports.getById=(req,res)=>{
    res.json(book.getBookById(parseInt(req.params.bookId)));
}

module.exports.save=(req,res)=>{
    const b=req.body;
    res.json(new book(null,b.title,b.ISBN,b.publishedDate,b.author).add());
}

module.exports.update=(req,res)=>{
    const b=req.body;
    res.json(new book(b.id,b.title,b.ISBN,b.publishedDate,b.author).update(parseInt(req.params.bookId)));
}

module.exports.delete=(req,res)=>{
    res.json(book.delete(parseInt(parseInt(req.params.bookId))));
}