let aNumber = 5;
console.log(typeof aNumber); // number

let aBigint = 5n;
console.log(typeof aBigint); // bigint, has value range of +/- (2^53 - 1)

let aString = "Hello LapTQ";
console.log(typeof aString); // string

let aBoolean = true;
console.log(typeof aBoolean); // boolean

let aNull = null;
console.log(typeof aNull); // object

let anUndefined;
console.log(typeof anUndefined); // undefined

let anObject = {
    name: "LapTQ",
    age: 22
};
console.log(typeof anObject); // object

/*
Symbols are immutable and unique. Every symbol created using Symbol()
is guaranteed to be different from any other symbol, even if they 
have the same description. It represents a unique identifier.
*/
let id1 = Symbol("id");
let id2 = Symbol("id");
console.log(typeof id1); // symbol
console.log(id1 == id2); // false