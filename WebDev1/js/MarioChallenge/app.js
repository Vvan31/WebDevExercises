function isTouching(a, b) {
	const aRect = a.getBoundingClientRect();
	const bRect = b.getBoundingClientRect();
	return !(
		aRect.top + aRect.height < bRect.top ||
		aRect.top > bRect.top + bRect.height ||
		aRect.left + aRect.width < bRect.left ||
		aRect.left > bRect.left + bRect.width
	);
}

const init = () => {
    //get the avatar
    const avatar = document.querySelector("#avatar")
    //get the coin
    const coin = document.querySelector("#coin")
    // Sounds 
    const coin_ring = new Audio("audio/smw_coin.wav");
    const step_sound = new Audio("audio/smw_footstep.wav");
    // Score 
    const score = document.querySelector("#score");
    let counting_score = 0;
    moveCoin();
    window.addEventListener('keyup', function(e){
        step_sound.play();
        if(e.key === 'ArrowDown' || e.key === 'Down'){
            moveVertical(avatar, 50);
        }
        if(e.key === 'ArrowUp' || e.key === 'Up'){
            moveVertical(avatar, -50);
        }
        if(e.key === 'ArrowLeft' || e.key === 'Left'){
            moveHorizontal(avatar, -50);
        }
        if(e.key === 'ArrowRight' || e.key === 'Right'){
            moveHorizontal(avatar, 50);
        }

        if(isTouching(avatar,coin)){
            coin_ring.play();
            moveCoin();
            counting_score+=1;
            score.innerHTML = `Score: ${counting_score}`
        } 
    });
}

const moveVertical = (element, amount) => {
    const currTop = extractPos(element.style.top);
    if (amount > 0) {
        if (560 > currTop && currTop > -1) {
            element.style.top = `${currTop + amount}px`;
        }
    }else{
        if (601 > currTop && currTop> 50) {
            element.style.top = `${currTop + amount}px`;
        }
    }
}
const moveHorizontal = (element, amount) => {
    const currTop = extractPos(element.style.left);
    if (amount > 0) {
        if (560 > currTop && currTop > -1) {
            element.style.left = `${currTop + amount}px`;
        }
    }else{
        if (601 > currTop && currTop> 50) {
            element.style.left = `${currTop + amount}px`;
        }
        //Flip avatar 
        /* element.scale(-1,1); */
    }
}


const extractPos = (position) => {
    if(!position) return 100;
    return parseInt(position.slice(0, -2))
}

const moveCoin = () => {
    const x = Math.floor(Math.random() * 600)
    const y = Math.floor(Math.random() * 600)
    coin.style.top = `${x}px`;
    coin.style.left = `${y}px`;
    // coin.style.?? = ??
}

//Sound 
/* function sound(src) {
    this.sound = document.createElement("audio");
    this.sound.src = src;
    this.sound.setAttribute("preload", "auto");
    this.sound.setAttribute("controls", "none");
    this.sound.style.display = "none";
    document.body.appendChild(this.sound);
    this.play = function(){
      this.sound.play();
    }
    this.stop = function(){
      this.sound.pause();
    }
  } */


init();
