$(document).ready(function () {
    // code goes here
  
    $('#menu').click(function(){
        console.log("CLicked");
        document.getElementById("menu-bar").classList.toggle("change");
        document.getElementById("nav").classList.toggle("change");
        document.getElementById("menu-bg").classList.toggle("change-bg");
    })
    
/* 
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
    }); */
});