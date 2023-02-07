const listElement = document.querySelector(".posts")
const fetchButton = document.querySelector("#available-posts button")
const postButton = document.querySelector("#new-post button")
const postTemplate = document.querySelector("template")

async function sendHttpRequest(method, url){
    //with XHR
    // const promise = new Promise((resolve, reject) => {
    //     const xhr = new XMLHttpRequest()
    //     xhr.open(method, url)
    //     xhr.onload = function(){
    //         if(xhr.status >= 200 && xhr.status < 300){
    //             //return the data back
    //             resolve(xhr.response)
    //         }else{
    //             reject("Something went wrong..... :<")
    //         }
    //     }
    //     xhr.send();
    // })

    // return promise

    //with fetch() function
    // const response = await fetch(url, {method})
    // const result = await response.json()
    // return result

    // return await fetch(url, {method}).then(r => r.json())

    //with axios
    const { data } = await axios(url, { method })
    console.log(data)
    return data
    // return axios.get(url)
}

async function fetchPosts() {
    const responseData = await sendHttpRequest("GET", "https://jsonplaceholder.typicode.com/posts")

    console.log("GET:  " + responseData)
    if(responseData.length > 0){
        for(const post of responseData){
            const postElClone = document.importNode(postTemplate.content, true)
            postElClone.querySelector("h2").textContent = post.title
            postElClone.querySelector("p").textContent = post.body
            postElClone.querySelector("li").id = post.id
            listElement.appendChild(postElClone)
        }
    }
}

 function postPost() {
    console.log("POST");
   /*  const responseData =  sendHttpRequest("POST", "https://jsonplaceholder.typicode.com/posts") */
    axios.post('https://jsonplaceholder.typicode.com/posts', {
        userid: '1',
        title: $(".title").val(),
        body: $(".content").val()
      })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });

   /*  const postElClone = document.importNode(postTemplate.content, true)
    postElClone.querySelector("h2").textContent = post.title
    postElClone.querySelector("p").textContent = post.body
    postElClone.querySelector("li").id = post.id
    listElement.appendChild(postElClone) */

}

// READ/GET
fetchButton.addEventListener("click", fetchPosts)
postButton.addEventListener("click", postPost)