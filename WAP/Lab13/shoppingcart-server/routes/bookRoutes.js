const express=require('express');
const router=express.Router();
const controller=require('../controller/bookController');

router.get('/',controller.getAll);
router.get('/:bookId',controller.getById);
router.post('/',controller.save);
router.put('/:bookId',controller.update);
router.delete('/:bookId',controller.delete);

module.exports=router;