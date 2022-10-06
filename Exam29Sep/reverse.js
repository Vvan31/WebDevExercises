function reverse(arr, result = []) {
    let last = Array.from(arr).pop();
    result[result.length] = last;
    return (arr.length <= 1)? result.join(''):
    reverse(arr.slice(0,-1), result)
}

let n = 'awesome';
console.log(reverse(n));