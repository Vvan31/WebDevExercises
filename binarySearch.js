//Author: Viviana Osorio. 26-09-2022. 

// Binary Search 

// This function accepts a sorted array and a value
function binarySearch(arr, n){
// Create a left pointer at the start of the array, and a right pointer at the end of the array
    let l_pointer = 0; 
    let r_pointer = arr.length; 

// While the left pointer comes before the right pointer:
    while (l_pointer < r_pointer ){
    // Create a pointer in the middle
        let m_pointer = Math.floor((r_pointer+l_pointer )/2); 
    // If you find the value you want, return the index
        if(n == arr[m_pointer]){
            return m_pointer; 
    // If the value is too small, move the left pointer up
        }else if(n > arr[m_pointer]){
            l_pointer = m_pointer; 
    // If the value is too large, move the right pointer down
        }else if(n < arr[m_pointer]){
            r_pointer = m_pointer; 
    // If you never find the value, return -1
        }
    }
    return -1;
}
//         0 1 2 3  4  5  6  7
var arr = [2,4,7,20,35,60,76,990];
console.log(binarySearch(arr,990));


// Recursive binary search 
function recursiveBS(arr, n, l_pointer = 0, r_pointer = arr.length){
    let m_pointer = Math.floor((r_pointer+l_pointer)/2); 
    if (n == arr[m_pointer]){
        return m_pointer; 
    }else{
        return (n < arr[m_pointer])? recursiveBS(arr, n, l_pointer, m_pointer) : recursiveBS(arr, n, m_pointer, r_pointer);
    }
}


// console.log(recursiveBS(arr,990));