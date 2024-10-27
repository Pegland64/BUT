var canvas = document.getElementById('canvas');
var ctx = canvas.getContext('2d');
ctx.fillRect(0,0,500,500);
ctx.beginPath();
ctx.moveTo(250,0);
ctx.lineTo(500,250);
ctx.lineTo(250,500);
ctx.lineTo(0,250);
ctx.fillStyle = 'yellow';
ctx.fill();
ctx.closePath();

ctx.beginPath();
ctx.rect(125, 125, 250, 250);
ctx.fillStyle = 'red';
ctx.fill();
ctx.closePath();

ctx.beginPath(); 
ctx.arc(250, 250, 125, 0, 2*Math.PI); 
ctx.fillStyle = 'lime'; 
ctx.fill();
ctx.closePath();

let a = 0;
let b = Math.PI/4;
ctx.beginPath();
ctx.moveTo(250,250);
ctx.lineTo(375,250);
ctx.arc(250, 250, 125, a,b);
ctx.fillStyle = 'blue'; 
ctx.fill();
ctx.closePath();

canvas.addEventListener('click', function(event) {
    ctx.beginPath(); 
    ctx.arc(250, 250, 125, 0, 2*Math.PI); 
    ctx.fillStyle = 'lime'; 
    ctx.fill();
    ctx.closePath();
    
    a = a + 0.1;
    b = b + 0.1;

    ctx.beginPath();
    ctx.moveTo(250,250);
    ctx.arc(250, 250, 125, a,b);
    ctx.fillStyle = 'blue'; 
    ctx.fill();
    ctx.closePath();

});

document.addEventListener('keydown', function(event) {
    if (event.key === 'l') {
        ctx.beginPath(); 
        ctx.arc(250, 250, 125, 0, 2*Math.PI); 
        ctx.fillStyle = 'lime'; 
        ctx.fill();
        ctx.closePath();
        
        a = a - 0.1;
        b = b - 0.1;

        ctx.beginPath();
        ctx.moveTo(250,250);
        ctx.arc(250, 250, 125, a,b);
        ctx.fillStyle = 'blue'; 
        ctx.fill();
        ctx.closePath();
    }
});
