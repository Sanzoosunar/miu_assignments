let i;
let from=3;
let to=8;
let timerId = setInterval((from,to)=>{
    if(i==undefined)
        i=from;

    console.log(i++);

    if(i>to)
        clearInterval(timerId);

},1000,from,to)