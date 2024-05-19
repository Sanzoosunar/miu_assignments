const book=require('../models/books');

module.exports.getById=(req,res,next)=>{
    res.json(book.getById(parseInt(req.params.bookId)));
}

module.exports.getAll=(req,res,next)=>{
    res.json(book.getAll(req.query.firstname));
}

module.exports.save=(req,res,next)=>{
    // console.log('inside book save');
    const b=req.body;
    console.log(b);
    res.json(new book(0,b.title,b.author).save());
}

module.exports.update=(req,res)=>{
    const b=req.body;
    res.json(new book(b.bookId,b.title,b.author).update(parseInt(req.params.bookId)));
}

module.exports.delete=(req,res)=>{
    res.json(book.delete(parseInt(req.params.bookId)))
}