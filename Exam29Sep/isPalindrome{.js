function isPalindrome(arr, original = arr ,result = []) {
    let last = Array.from(arr).pop();
    result[result.length] = last;
    return (arr.length <= 1)? 
        (result.join('') == original)?true:false
        :isPalindrome(arr.slice(0,-1),original ,result)
}

let n = 'tacocat';
console.log(isPalindrome(n));