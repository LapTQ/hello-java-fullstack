
let count = 0;
if (true) {
  count = 1;
  console.log(count); // 1
}
console.log(count); // 1

/* !!! ATTENTION

Variable declared with let is only available in the block it is declared in

let count = 0;
if (true) {
    let count = 1;
    console.log(count); // 1
}   
console.log(count); // 0
*/

// constant, cannot be changed
const COUNT = 0;

/* !!! ATTENTION

Variable declared with var in the block is a shared and overriden.
var is not preferred in modern JavaScript as compared to let and const
*/
var globalCount = 0;
if (true) {
  var globalCount = 1;
  console.log(globalCount); // 1
}
console.log(globalCount); // 1


