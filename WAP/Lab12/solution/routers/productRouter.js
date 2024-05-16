const express=require('express');
const route=express.Router();
const path=require('path');

route.get('/add',(req,res,next)=>{
    console.log(path.join(__dirname,".."));
    res.sendFile(path.join(__dirname,"..","views","product.html"));
})

route.post('/add',(req,res,next)=>{
    const{ProductName,Price,Description}=req.body;
    res.status(201).send({isSuccess:true,data:`product added successfully: {${ProductName},${Price},${ Description}}`});
})

module.exports=route;