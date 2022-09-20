/**
 * 
 * Javascript coding task 2-1
 * 
 * ---description---
 * 1. Create variables to represent scores of exams for Matt and Simon and set values 80 and 45;
 * 
 * 2. Create variable to set the lower limit for passing an exam and assign to it value as 51;
 * 
 * 3. Write the condition in if statement, which will check if both students have passed an 
 * exam and log the result in console;
 * 
 * 4. Use else if statement in order to check if one of the students has passed an exam and 
 * log the result in console;
 * 
 * 5. Use else statement in order to display in console that both students have failed;
 * 
 * 6. In case of passing the exam by one of the students, find out which one was that and 
 * display in console as an additional information the student name and his points
 * 
 * 7. Test all the possible cases (a. both students passed; b. Matt passed and Simon 
 * failed; c. Simon passed and Matt failed; d. both students failed).
 */
function grade(){
    const matt_score = 80;
    const simon_score = 45; 
    const lower_passing_score  = 51; 

    if (matt_score >= lower_passing_score && simon_score >= lower_passing_score){
        console.log("Both passed the exam")
    }else if(matt_score < lower_passing_score || simon_score < lower_passing_score){
        console.log("One of them failed the exam");
        console.log((matt_score < lower_passing_score) ? "Matt did't pass the examen. \nScore: "+ matt_score : "Simon did't pass the examen. \nScore: "+ simon_score   );
    }else{
        console.log("Both students failed the exam")
    }
}
grade();
//-----------------------------------------------------------------------------------------------//

/**
 * 
 * Javascript coding task 2-2
 * 
 * ---description---
 *  1. Create an array - students, insert four items, which should be objects 
 *  and have three properties: name, score1, score2, with the following values:
 *          a. John, 47, 46
 *          b. Bob, 23, 24
 *          c. Nick, 40, 35
 *          d. Alex, 44, 45
 * 
 *  2. Suppose that, students have chance to get different degrees of diploma, 
 *  like A, B, C, D, E and those degrees are relevant
 *  to the following passing limits 91, 81, 71, 61, 51. 
 *  According to that, create two arrays for passing limits and for degrees
 * 
 *  3. Create function which will calculate total score (score1 + score2) for each student.
 * 
 *  4. Create function and use in it for loops, if else statements and whatever 
 *  you need, in order to figure out, which student has passed an exam and what 
 *  kind of degree he has got.
 * 
 *  5. Display the final result in console.
 */
function student_grades(){
    const students = [
        {name: "John", score1: 47, score2: 46},
        {name: "Bob", score1: 23, score2: 24},
        {name: "Nick", score1: 40, score2: 35},
        {name: "Alex", score1: 44, score2: 45}
    ];
    const degrees = ["A","B","C","D","E"];
    const passing_limits = [91, 81, 71, 61, 51];
    const grades = calculate_total_score(students);

    const final_grades = [];
    let degree = "";

    for (let i = 0; i < grades.length; i++ ){
        if (grades[i] >= passing_limits[0]){
            degree = degrees[0];
        }else if (grades[i] >= passing_limits[1]){
            degree = degrees[1];
        }else if (grades[i] >= passing_limits[2]){
            degree = degrees[2];
        }else if (grades[i] >= passing_limits[3]){
            degree = degrees[3];
        }else {
            degree = degrees[4];
        }
        final_grades[i] = {
            name: students[i].name, 
            degree: degree, 
            grade: grades[i]};
    }
    print_result(final_grades);
}

function calculate_total_score(students){
    const grades = [];
    for(let i = 0; i < students.length; i++){
        grades[i]= students[i].score1 + students[i].score2; 
    }
    return grades;
}
function print_result(final_grades){
    final_grades.forEach(element => {
        console.log((element.grade<51)? 
          element.name +" did't pass \n   score: " + element.grade + "\n   degree: " +element.degree 
        : element.name +" passed!! \n   score: " + element.grade + "\n   degree: " +element.degree);
    });
};

student_grades();
//-----------------------------------------------------------------------------------------------//