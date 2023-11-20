let a = "1 + 2 = ${1 + 2}"; // can use ", ', or `
console.log(a); // 1 + 2 = ${1 + 2}

let b = `1 + 2 = ${1 + 2}`; // will evaluate the expression if using ``
console.log(b); // 1 + 2 = 3

let c = 'Hello';
c[0] = 'h';
console.log(c); // Hello, string is immutable

let d = 'Hello';
let e = 'world';
let f = d + ' ' + e; // or d.concat(' ', e);
console.log(f);

let g = 'Hello world';
let h = g.slice(0, 5); // not including index 5, 
// or g.substring(0, 5); but behave differently so pay ATTENTION
let i = g.slice(6);
let j = g.slice(-5); // from index -5 to the end like Python
