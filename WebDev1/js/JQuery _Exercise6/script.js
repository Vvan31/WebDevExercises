/**
 * Assign a click event handler to the add button with an id of addTask.
 *
 * When the add button is clicked:
 *  - If the textbox is empty, generate an alert with the text “Error: Please enter a task first”.
 *  - If the text box is not empty, generate an alert with the text containing the task name. For example, if the text in the input box is “Complete Assignment”, generate an alert with text “New Task: Complete Assignment”.
 *  - Clear the text inside the text box after the add button is clicked.
 * 
 * 
 * When the  button is clicked, and the text of the text box is not empty:
    - Create a div task element with the class set to task and the text equal to the value of the input box.
    - Create a delete button element with the id set to delete and the class set to fas fa-trash-alt. This class corresponds to the trashcan icon in CSS.
    - Create a done button element with the id set to done and the class set to fas fa-check. This class corresponds to the check icon in CSS.
    - Insert the delete and the done button elements at the  of the newly created task element.
    - Insert the div task element at the  of the div element with class notCompleted.

    - When the user clicks on one of the  button elements nested within a task,  the corresponding  element from the webpage.
    - When the user clicks on one of the  button elements nested within a task,  the corresponding  element from the  list to the end of the  list.
    - Additionally, remove the done button element from the corresponding task element.
Optional
    - When the user clicks on one of the done button elements, the corresponding parent task element from the “To-do” list fades out (1 second) and fades back in (1 second) to the end of the “Done” list.
    - When the user clicks on one of the delete button elements, the corresponding parent task element fades out (1 second) and is deleted from the webpage. 
*/

 $(document).ready(function () {
    // code goes here

    $('#addTask').click(function(){
        const input_message = $(".textBox").val();
        $(".textBox").val("");
        if (input_message) {

    // Create a div task element with the class set to task and 
    //the text equal to the value of the input box.
            const newdiv = document.createElement( "div" );
            newdiv.className ="task";
            newdiv.innerHTML = input_message;
    //Create a delete button element with the id set to delete and 
    //the class set to fas fa-trash-alt. 
            const delete_btn = document.createElement( "btn" );
            delete_btn.className ="fas fa-trash-alt";
            delete_btn.id = "delete";
    // Create a done button element with the id set to done and 
    // the class set to fas fa-check.
            const done_btn = document.createElement( "btn" );
            done_btn.className ="fas fa-check";
            done_btn.id = "done";
    // Insert the delete and the done button elements at the end 
    // of the newly created task element.
            $( newdiv ).append( delete_btn );
            $( newdiv ).append( done_btn );
            
    // Insert the div task element at the  of the div element with 
    // class notCompleted.
            $( ".notCompleted" ).append( newdiv );
            
            console.log(newdiv);

            alert("New Task: " + input_message) 
        } else {
            alert("Error: Please enter a task first");
        } 
    })

    $('#delete').click(function(){
        this.remove(); // ????????
    });
});