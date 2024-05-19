const express=require('express');
const router=express.Router();
const bookController=require("../controllers/bookController");

router.get('/',bookController.getAll);
router.get('/:bookId',bookController.getById);
router.post('/',bookController.save);
router.put('/:bookId',bookController.update);
router.delete('/:bookId',bookController.delete);

module.exports=router;