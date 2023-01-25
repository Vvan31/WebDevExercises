/* JavaScript DOM Exercises 01 */

/*
  Exercise 01
  -----------
  Highlight all of the words over 8 characters long in the paragraph text (with a yellow background for example)
*/

const text = document.querySelector("p");
text.innerHTML = text.textContent.split(" ").map(word =>{
  if (word.length > 8 &&  word.match(/[a-zA-Z]/)) {
    return `<mark>${word}</mark>`
  }
  return word;
}).join(" ");

/*
  Exercise 02
  -----------
  Add a link back to the source of the text after the paragraph tag.
  (http://officeipsum.com/)
*/

const link = document.createElement("a"); // empty node. 
link.href = "https://youtu.be/kJunmC9YKQA";
link.innerHTML = "Click me. No, really... do it!";
link.target = "_blank"
document.body.appendChild(link);

/*
  Exercise 03
  -----------
  Split each new sentence on to a separate line in the paragraph text.
  A sentence can be assumed to be a string of text terminated with a period (.)
*/

text.innerHTML = text.innerHTML.split(".").join(".  <br><br>")

/* 
  Exercise 04
  -----------
  Count the number of words in the paragraph tag and display the count afer the heading.
  You can assume that all words are separated by one singular whitespace.
*/
                            // NO SCAPE CHARACTERS INCLUDED.
const numberOfWords = text.innerText.split(" ").length; 
const div_wordcount = document.createElement("div");

div_wordcount.innerText = `${numberOfWords} words in total!`;
//Add to page
document.body.insertBefore(div_wordcount,text)

/*
  Exercise 05
  -----------
  Replace all question marks (?) with thinking faces (🤔) and exclamation marks (!) with astonished faces (😲) 
*/
/* 
text.innerHTML = text.textContent.split("").map(word =>{
  if (word.match(/[?]/)) {
    return `🤔`
  }
  return word;
}).join("");
 */

text.innerHTML = text.innerHTML.replaceAll("?", " 🤔").replaceAll("!", " 😲 ");
