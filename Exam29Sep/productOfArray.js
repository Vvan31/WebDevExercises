function productOfArray(arr, result = 1) {
    return (arr.length < 1)? result:productOfArray(arr.slice(1), result*arr[0])
}

let n = [1,2,3];
console.log(productOfArray(n));