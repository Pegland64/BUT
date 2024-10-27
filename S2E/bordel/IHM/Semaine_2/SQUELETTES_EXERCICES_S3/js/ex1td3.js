let im1 = document.getElementById("im1");
let p1 = document.getElementById("p1");
let p2 = document.getElementById("p2");
let p3 = document.getElementById("p3");
p1.onclick = (event) => {
    if (p2.className === "c2"){
        p1.className = "c2";
        p2.className = "c1";
        p3.className = "c1";
    }else{
        p1.className = "c1";
        p2.className = "c2";
        p3.className = "c3";
    };
};


im1.onmouseover = (event) => {
    im1.src = "ois3.jpg";
};
im1.onmouseout = (event) => {
    im1.src = "ois1.jpg";
};
