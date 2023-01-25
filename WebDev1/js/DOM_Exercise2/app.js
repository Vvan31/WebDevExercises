// Parents nodes
const form = document.querySelector("#add");
const list = document.querySelector("#list");

// Events. 
form.addEventListener("submit", function (evt) {
    evt.preventDefault(); // No page refresh. 
    // Prevent submit if input is empty
    const user_input = evt.target[0].value;
    if (!user_input) { return }

    // New list element 
    const new_element = document.createElement("li");
    new_element.innerHTML = `<p>${user_input}</p>
    <p><i class="fa fa-pencil-square-o"></i><i class="fa fa-times"></i>
    </p><input type="text" class="edit-note">`;

    // Add to list 
    list.appendChild(new_element);

    // Clear input field
    evt.target[0].value = "";
})