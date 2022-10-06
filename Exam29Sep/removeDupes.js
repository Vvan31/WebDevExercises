function productOfArray(arr, result = 0) {
    return (arr.length < 1)? result:productOfArray(arr.slice(1), result*arr[0])
}

let n = [1,2,3,4,5];
console.log(productOfArray(n));