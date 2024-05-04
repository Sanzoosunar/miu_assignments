
//Problem 1 Solution
function sum(arr){
    const result=arr.filter(a=>a>20);
    return result.reduce((accum,num)=>accum+num,0)
}
console.log('*********Problem 1 solution ***************');
console.log('sum of array : ',sum([22,20,30,1,3,5]));

//Problem2 Solution
const getNewArray = function(strArray){
    return  strArray.filter(a=>a.length>=5 && a.includes('a'));
}
console.log('*********Problem 2 solution ***************')
console.log("string length greater than or equal to 5 : " , getNewArray(["Ball","Apple","Orange","Ant","Banana"]));


//Problem 3 solution

console.log('*********Problem 3 solution ***************')
const arrFunc=(a,b,c)=>{
    // return a.concat(b, c);
    return [...a,...b,...c];
}
console.log(arrFunc('hi', [1,2,3], ['Hello','world']));

//Problem 4 solution
console.log('*********Problem 4 solution ***************')
const students = [
    { name: 'Quincy', grades: [99, 88], courses:['cs301', 'cs303']},
    { name: 'Jason', grades: [29, 38], courses:['cs201', 'cs203']},
    { name: 'Alexis', grades: [79, 78], courses:['cs105', 'cs211'] },
    { name: 'Sam', grades: [91, 82], courses:['cs445', 'cs303'] },
    { name: 'Katie', grades: [66, 77], courses:['cs303', 'cs477'] }
  
];

const arrResult={};
students.filter(a=>a.courses.includes('cs303'))
                      .map(a=>{
                        const grade=(a.grades.reduce((accum,g)=>accum+g,0))/a.grades.length;
                        arrResult[a.name]=grade;
                      });
console.log(arrResult);
