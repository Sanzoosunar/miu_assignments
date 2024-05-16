const express=require('express');
const router=express.Router();
const path=require('path')

router.get('/add',(req,res,next)=>{
    res.sendFile(path.join(__dirname,"..","views","user.html"))
})

router.post('/add',(req,res,next)=>{
    const{UserName,PhoneNumber,Email}=req.body;
    res.status(201).send({isSuccess:true,data:`user added successfully: {${UserName},${PhoneNumber},${ Email}}`});
})
module.exports=router;