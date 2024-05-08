function Student(firstName,lastName,grades){
    this.firstName=firstName;
    this.lastName=lastName;
    this.grades=grades;
    this.inputNewGrade=function(newGrade){
        this.grades.push(newGrade);
    }
    this.computeAverage=function(){
        let totalGrades= this.grades.reduce((accum,grade)=> accum+grade,0);
        return totalGrades/this.grades.length;
    }
}

let std1=new Student('sanju','sunar',[60,60,60]);
std1.inputNewGrade(80);
console.log(std1.computeAverage());

let std2=new Student('tina','xing',[85,70,97]);
std1.inputNewGrade(86);
console.log(std1.computeAverage());