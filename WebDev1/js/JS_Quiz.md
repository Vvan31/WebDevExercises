<small>Just a quick test to test your javascript understanding.</small>
___

## 1) What is ES6?

```bash
ES6 is the standarization of JavaScript. It makes easier to with JavaScript by providing features like classes, arrow functions among others. 
```

## 2) Name 3 examples of ES6 features

```bash
1. Let and const variables declaration. Instead of using var for declaring a variable, let and const can be used inside a certain block scope instead of function scope. 
2. Arrow Functions. Let the used write a more consice function syntax by removing keywords like function and return.
3. Default Parameters.The user can use default values for paramenters in ithe signature of the function insead of having to use logic inside of it. function(a = 2, b = 10) 
```

## 3) What is the difference between let and const?

```bash
let is used when the variable may be reassigned in the future and const is used when it will not be reassigned.
```

## 4) How do you access object values? Give 3 examples

```bash
1. Property accessor: Using the name of the property. Object.property
2. Square brackets. Object['property']
3. Object destructibg. const { property } = Object
```

## 5) What does setInterval and setTimeout do?

```bash
setTimeout() calls a function once a specified delay has pass and setInterval() calles a function continuously during a specified time. 
```

## 6) What are promises?

```bash
A promise is a placeholder that will be available in the future. They are used to handle asynchronous functions and handle errors.
```

## 7) Convert this async function to async/await

```bash
getQuote()
    .then((quote) => {
        console.log(quote)
    })
    .catch((error) => {
        console.error(error)
    })
```
```bash
async getQuote(){
  return await quote
}
```

## 8) Convert this code to arrow function

```bash
function greeting(firstname, lastname){
    return `Hi ${firstname} ${lastname}`;
}
```
```bash
let greeting = (firstname, lastname) => `Hi ${firstname} ${lastname}`;
```

## 9) Explain what a callback function is

```bash
Is a function that is passed to another function as an argument that then is called inside the outer function
```

## 10) What does the functions pop and push do to an array?

```bash
pop let you take out an element from the array and store it in a variable if you want.
push let you put in an element at the end of the array. 
```

## 11) What is the expected answer to this code?

```bash
let string1 = "";
let object1 = {a:1, b:2, c:3};

for(const property1 in object1){
    string1 += object1[property1]
}

console.log(string1);

output: 123
```

## 12) What data type would Array.map() and Array.filter() return?

```bash
Array.map() and Array.filter() returns a new array after the alterations of the original array.
```

## 13) What data type would Array.includes() and Array.some() return?

```bash
Array.includes() and Array.some() return a boolean if the element(s) is/are or not in the array. 
```

## 14) Write down the 4 main methods of rest api

```bash
1. POST: creates a new resource in a collection.
2. PUT: updates a resource replacing its content entirely. 
3. GET: returns a representation of  the collection data. 
4. DELETE: deletes a single resource. 
```

## 15) What is the difference between JSON and a JavaScript object?

```bash
JavaScript objects can contain functions, and the key can be without the double quotes. JSON can be used and created by other programming languages. 
```
