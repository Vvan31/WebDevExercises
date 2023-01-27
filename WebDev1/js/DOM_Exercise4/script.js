const images = [
    "./media/avocado.jpeg",
    "./media/pancake.jpeg",
    "./media/sandwich.jpeg",
    "./media/spaghetti.jpeg"
]
let current_index = 0; 
const img = document.querySelector('img');
const btn_next = document.querySelector('#next-button');
const btn_prev = document.querySelector('#prev-button');

window.addEventListener("DOMContentLoaded", () => {
    img.src = images[0]
})

 function changeImage(index){
    if (index > 0 ) {
        if (current_index >= 3 ) {
            current_index = 0;
            img.src = images[0]
        }else{
            current_index +=1;
            img.src = images[current_index]
        }
    }else{
        if (current_index <= 0 ) {
            img.src = images[3]
            current_index = 3;
        }else{
            current_index -=1;
            img.src = images[current_index]
        }
    }
 }

btn_next.addEventListener("click", () => {
    console.log(current_index);
    changeImage(1);
})
btn_prev.addEventListener("click", () => {
    console.log(current_index);

    changeImage(-1);
})
