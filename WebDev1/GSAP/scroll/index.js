

gsap.from(".block h2 ",{
    duration: 5,
    autoAlpha: 0,
    y: 100,
    scale: 0.5,
    scrollTrigger:{
        "trigger": ".block h2",
        markers: true,
        start: "top 90%",
        end: "bottom 10%",
        toggleAction:"play pause revers restart ",
        scrub: true
    }
});