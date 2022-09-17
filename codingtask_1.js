/** Author: Viviana Osorio 16/09/2022 */

/**
 * 
 * Javascript coding task 1
 * 
 * ---description---
 * Write a function that will take a student's grade and print out if they passed or failed the exam.
 * - if the student's grade is 70 or higher, print "passed"
 * - if the student's grade is below 70, print "failed"
 * - if the student's grade is 100, print "perfect score"
 * - if the student's grade is below 0, print "invalid grade"
 * - if the student's grade is not a number, print "invalid grade"
 * ---example---
 * studentGrade(100) // "perfect score"
 * studentGrade(70) // "passed"
 */
    
function evaluateGrade(grade){
    if (grade == 100){
        console.log("perfect score");
    }else if (grade >= 70){
        console.log("passed")
    }else if (grade < 70 && grade > 0){
        console.log("pasfailedsed")
    }else{
        console.log("invalid grade")
    }
}
// evaluateGrade(7);
// evaluateGrade(100);
// evaluateGrade("f");

//-----------------------------------------------------------------------------------------------//

/**
 * 
 * Javascript coding task 2
 * 
 * ---description---
 * Write a function that will take a number and print out if it is even or odd.
 * - if the number is even, print "even"
 * - if the number is odd, print "odd"
 * - if the number is not a number, print "invalid number"
 * - if the number is less than 0, print "invalid number"
 * - if the number is 0, print "even"
 */

 function evenOrOdd(number){
    if (number < 0 || isNaN(number) ){
        console.log("invalid number")
    }else if (number == 0 || number % 2 == 0){
        console.log("even");
    }else if (number % 2 != 0){
        console.log("odd")
    }else{
        console.log("invalid number")
    }
}
// evenOrOdd(4);
// evenOrOdd(7);
// evenOrOdd(-1);
// evenOrOdd("p");

//-----------------------------------------------------------------------------------------------//

/**
 * 
 * Javascript coding task 3
 * 
 * ---description---
 * Write a function that will take a number and print out if it is positive, negative, or zero.
 * - if the number is positive, print "positive"
 * - if the number is negative, print "negative"
 * - if the number is 0, print "zero"
 * - if the number is not a number, print "invalid number"
 */
 function positiveOrNegative(number){
    if ( isNaN(number) ){
        console.log("invalid number")
    }else if (number == 0 ){
        console.log("zero");
    }else if (number > 0){
        console.log("positive")
    }else{
        console.log("negative")
    }
}
// positiveOrNegative(0);
// positiveOrNegative("k");
// positiveOrNegative(-22);
// positiveOrNegative(3);
//-----------------------------------------------------------------------------------------------//

/**
 * 
 * Javascript coding task 4
 * 
 * ---description---
 * Write a function that will take a person object and print out if they are a minor or an adult.
 * - if the person is a minor, print "minor" mb
 * - if the person is an adult, print "adult"
 * - if the person's age is not a number, print "invalid person"
 * ---example---
 * const person = {
 *   name: "John",
 *   age: 25
 * }
 * 
 * isMinor(person) // "adult"
 * 
 */
function isMinor(person){
    if (isNaN(person.age)){
        console.log("invalid person");
    }else if( person.age < 18){
        console.log("minor");
    }else{
        console.log("adult");
    }
}
// const person2 = {
//     name: "John",
//     age: 25
// }
// const person3 = {
//     name: "John",
//     age: 15
// }
// const person4 = {
//     name: "John",
//     age: 'u'
// }
// isMinor(person2);
// isMinor(person3);
// isMinor(person4);
//-----------------------------------------------------------------------------------------------//

/**
 * 
 * Javascript coding task 5
 * 
 * ---description---
 * Write a function that will concatenate two strings together.
 * - if the first string is not a string, print "invalid string"
 * - if the second string is not a string, print "invalid string"
 * - if both strings are not strings, print "invalid strings"
 * - if both strings are strings, print the concatenated string
 * ---example---
 * concatStrings("hello", "world") // "helloworld"
 * concatStrings("hello", 1) // "invalid string"
*/
function concatenateStrings(string1, string2){
    if (isNaN(string1) && isNaN(string2)){
        console.log(string1+string2);
    }else if(!isNaN(string1) && !isNaN(string2)){
        console.log("invalid strings");
    }else{
        console.log("invalid string")
    }
}
concatenateStrings(3, "f");
concatenateStrings("Hello ", "World");
concatenateStrings(4, 5);

