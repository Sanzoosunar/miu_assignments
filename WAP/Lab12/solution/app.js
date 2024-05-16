const express = require('express');
const app = express();
const path = require('path');
const productRouter=require('./routers/productRouter')
const userRouter=require('./routers/userRouter')

app.use(express.static(path.join(__dirname,'assets')))
app.use(express.urlencoded());
app.use('/product',productRouter);
app.use('/user',userRouter);
app.use((req,res)=>{
    res.sendFile(path.join(__dirname,"views","NotFound.html"))
})

app.listen(process.env.PORT || 3000, () => {
    console.log(path.join(__dirname,'assets'))
    console.log(`Server is running at : ${process.env.PORT || 3000}`);
})
