const postTemplate = document.querySelector(".card-template")
const listElement = document.querySelector(".posts")
const addbtn = document.querySelector(".add_btn")
const listCart = document.querySelector(".cart-products")
const totalTag = document.querySelector(".total")
const counterTag = document.querySelector(".counter")

let number_products = 0;
let total = 0;

let products_in_cart = {};

$(document).ready(function () {
    fetchPosts();
    // menu 
    $('#menu-bar').click(function(){
        console.log("CLicked");
        document.getElementById("menu-bar").classList.toggle("change-top");
        document.getElementById("nav").classList.toggle("change");
        document.getElementById("menu-bg").classList.toggle("change-bg");
       /*  document.getElementById("menu-bg").classList.toggle("change-bg"); */
        totalTag.classList.toggle("change");
    })
    // API GET products.
    async function sendHttpRequest(method, url, content){
        const { data } = await axios(url, { method })
        return data
    }

    async function fetchPosts(){
    let responseData = await sendHttpRequest("GET", "https://dummyjson.com/products","");
    let dataArray = Object.entries(responseData)[0][1];
    console.log(dataArray)

         if(dataArray.length > 0){
            for(const post of dataArray){
                const postElClone = document.importNode(postTemplate.content, true)
                postElClone.querySelector("h3").textContent = post.title
                postElClone.querySelector("p").textContent = "Price: $"+post.price
                postElClone.querySelector("img").src = post.images[0]
                listElement.appendChild(postElClone)
            }
        } 
    }

    // Add products to shopping cart. 
    document.addEventListener("click", function(e){
        const target = e.target.closest("#add_btn");
        const deleteTarget= e.target.closest("#delete");

        if(target){
          const main_div = target.parentNode
          //create post
          const product = document.createElement("div");
          const price = main_div.querySelector("#price").innerHTML.replace(/[^0-9]/gi, '');
          product.className = "cart_product";
          product.innerHTML = main_div.querySelector("#product_name").innerHTML + " - " + price; 
          
          const delete_btn = document.createElement( "button" );
          delete_btn.className ="fas fa-trash-alt";
          delete_btn.id = "delete";
          $(product).append( delete_btn);

          //Update product count and total 
          updateCounterAndTotal(price, 1)
          //adds to cart
            //add to array. 
            /* 
            if (product in products_in_cart) {
                
            }else{

            } */

            $(".cart-products").append(product)
         
        }else if(deleteTarget){
            const main_div = deleteTarget.parentNode
            const price = main_div.innerHTML.replace(/^[^-]*/gi, '').replace(/[^0-9]/gi, '')

            updateCounterAndTotal("-"+price, -1)
            console.log(price);
            console.log(main_div);
            main_div.remove();
        }
      });

      function updateCounterAndTotal(price, count){
        total += parseInt(price);
        number_products += parseInt(count);
        totalTag.innerHTML ="Total: $" + total
        counterTag.innerHTML = " (" + number_products + ")" 
      }
});