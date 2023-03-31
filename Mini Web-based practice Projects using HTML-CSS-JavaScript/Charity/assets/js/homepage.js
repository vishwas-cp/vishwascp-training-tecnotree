// Cause 'Read More' buttons to show more text and 'Read Less' buttons to show less text
const readBtn = document.querySelector('#readBtn1');
const more = document.querySelector('#more1');
const dots = document.querySelector('#dots1');

more.style.display = 'none';

readBtn.addEventListener('click', () => {
    // Display more text and a 'Read Less' button
    if (more.style.display == 'none') {
        dots.style.display = 'none';
        more.style.display = 'block';
        readBtn.innerText = 'Read Less';
    }
    // Display less text and a 'Read More' button
    else {
        dots.style.display = 'inline';
        more.style.display = 'none';
        readBtn.innerText = 'Read More';
    }
});

const readBtn2 = document.querySelector('#readBtn2');
const more2 = document.querySelector('#more2');
const dots2 = document.querySelector('#dots2');



more2.style.display = 'none';

readBtn2.addEventListener('click', () => {
    // Display more text and a 'Read Less' button
    if (more2.style.display == 'none') {
        dots2.style.display = 'none';
        more2.style.display = 'block';
        readBtn2.innerText = 'Read Less';
    }
    // Display less text and a 'Read More' button
    else {
        dots2.style.display = 'inline';
        more2.style.display = 'none';
        readBtn2.innerText = 'Read More';
    }
});




let sections = document.querySelectorAll(".section");
window.onscroll = function fadeIn() {
    sections.forEach(section => {
        let sectionSize = section.getBoundingClientRect();
        let bottomPart = sectionSize.bottom;
        if (window.scrollY >= bottomPart) {
            section.style.opacity = "1";
            section.style.transform = "translateX(0)";
            section.style.transition = "1s ease-in-out";
        } else {
            section.style.opacity = "0";
            section.style.transform = "translateX(-20px)";
            section.style.transition = "1s ease-in-out";
        }
    });
}

// Death Counter

const COUNTER = document.getElementById("counter");
const DEATHS = document.getElementById("death");

var theMinutes = 0;
var seconds = 0;

var count = 0;


// Cause the function to work after each 1000 miliseconds
var time = setInterval(countSeconds, 1000);