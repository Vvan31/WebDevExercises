let n = [3,5,7,8,-5,2];
let sum = n.reduce(function(a, b) { return a + b}, 0);

console.log(sum);

function sumArray(values){
    let sum = 0; 
    for (let i = 0; i < values.length; i++) {
        sum += values[i];
    }
    return sum;
}
console.log(sumArray(n));