let t1 = gsap.timeline();
t1.fromTo(".nav", 
    { opacity: 0, x: -50 },
    { opacity: 1, duration: 1, x: 0 }
);
t1.fromTo(".title", 
    { opacity: 0, y: 50 },
    { opacity: 1, duration: 1, y: 0 }, "<.5"
);
t1.fromTo(".tagline", 
    { opacity: 0, y: 50 },
    { opacity: 1, duration: 0.5, y: 0 }, "<.4"
);
t1.fromTo(".desc", 
    { opacity: 0, y: 50 },
    { opacity: 1, duration: 0.5, y: 0 }, "<.4"
);
t1.fromTo(".beer", 
    { opacity: 0, y: -500 },
    { opacity: 1, duration: 0.4, y: 10 }, "<0.7"
);
t1.to(".beer",
    { y: "36px", repeat: -1, yoyo: true, duration: 1.5 ,  ease: "power1.inOut"},
);