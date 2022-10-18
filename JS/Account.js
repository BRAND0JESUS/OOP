/*
function Account(name, document) {
    this.id;        // this -> reserved word,  
    this.name = name;      //.(point) -> use point from an instanced object
    this.document = document;
    this.email;
    this.password;
}
*/
// TODO we just could put the mouse over the 3 points of function and select Quick fix to apply EcmaScript 6

// USING  EcmaScript 6 STANDAR 
class Account {

    constructor(name, document) {
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

}