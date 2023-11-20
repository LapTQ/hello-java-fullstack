function aFunction(a, b) {
    console.log(a + b);
    return a + b; // optional
}


let aGlobalVariable = 1;
function modifyAGlobalVariable() {
    aGlobalVariable ++;

    let aLocalVariable = 10;
}
modifyAGlobalVariable();
console.log(aGlobalVariable); // 2
console.log(aLocalVariable); // raises an error

/*

!!! ATTENTION

If declare the aLocalVariable inside the function without let, it will be a global variable
then there will be no error when calling it outside the function.

function modifyAGlobalVariable() {
    aLocalVariable = 10;
}
modifyAGlobalVariable();
console.log(aLocalVariable); // 10, no error
*/