const express=require('express');
const app=express();
const bookRouter=require('./routes/bookRoutes');

app.use(express.json());
app.use('/books',bookRouter);

app.use((error,req,res,next)=>{
    res.status(500).json({success:false,message:error.message});
});
app.use((req,res,next)=>{
    res.status(404).json({success:false,message:"page not found"});
})


app.listen(2222,()=>{
    console.log('server started!!!!');
})