/*let group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
         this.students.forEach(function (student) {
            console.log(this.title + ": " + student);
        });
    }
};
group.showList();
*/

// 1st way using self
 group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
        const self=this;
        self.students.forEach(function (student) {
            console.log(self.title + ": " + student);
        });
    }
};
console.log('------------------1st way------------');
group.showList();

//2nd way using arrow function
group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
        this.students.forEach(student=>console.log(this.title + ": " + student));
    }
};
console.log('------------------2nd way------------');
group.showList();


//3rd way
console.log('------------------3rd way------------');
group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
        this.students.forEach(function (student) {
            console.log(group.title + ": " + student);
        });
    }
};
group.showList();

//4th way
console.log('--------------4th way----------')
group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
        this.students.forEach(function (student) {
            console.log(this.title + ": " + student);
        }.bind(this));
    }
};
group.showList();

//5th way
console.log('--------------5th way----------')
group = {
    title: "Our Group",
    students: ["John", "Pete", "Alice"],
    showList: function () {
        this.students.forEach(function (student) {
            console.log(this.title + ": " + student);
        },this);
    }
};
group.showList();