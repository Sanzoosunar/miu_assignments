const express=require('express');
const app=express();
const bookRouter=require('./routes/bookRoute');

app.use(express.json());
app.use('/books',bookRouter);

app.use((err,req,res,next)=>{
    res.status(500).json(err.message);
});

app.use((req,res,next)=>{
    res.status(404).json({isSuccess:false,message:"Page not found"})
})

app.listen(2222,()=>{
    console.log('server started!!!!');
})
