let L = 500;
let l = 500;

let canvas = document.getElementById('canvas');

let ctx = canvas.getContext('2d');
ctx.fillStyle = 'blue';
ctx.fillRect(0, 0, L, l);

function snake(){
    let x = 250;
    let y = 250;
    let dx = 0;
    let dy = 0;
    let taille = 10;
    let snake = [{x, y}];
    let Elephants = {x: Math.floor(Math.random() * 10)*50, y: Math.floor(Math.random() * 10)*50};

    function dessinerSnake(){
        ctx.fillStyle = 'Lime';
        snake.forEach((partie) => {
            ctx.fillRect(partie.x, partie.y, taille, taille);
        });
    }

    function dessinerElephants(){
        ctx.fillStyle = 'grey';
        ctx.fillRect(Elephants.x, Elephants.y, taille, taille);
    }

    function moveSnake(){
        x += dx;
        y += dy;
        snake.unshift({x, y});
        if (x === Elephants.x && y === Elephants.y){
            Elephants = {x: Math.round(Math.random() * 10)*50, y: Math.round(Math.random() * 10)*50};
        } else {
            snake.pop();
        }
    }

    function checkCollision(){
        if (x < 0 || x >= L || y < 0 || y >= l){
            return true;
        }
        for (let i = 1; i < snake.length; i++){
            if (x === snake[i].x && y === snake[i].y){
                return true;
            }
        }
        return false;
    }

    function update(){
        if (checkCollision()){
            clearInterval(intervalId);
            alert('Game Over');
        } else {
            ctx.fillStyle = 'blue';
            ctx.fillRect(0, 0, L, l);
            dessinerSnake();
            dessinerElephants();
            moveSnake();
        }
    }

    document.addEventListener('keydown', function(event){
        switch(event.key){
            case 'z':
                dx = 0;
                dy = -taille;
                break;
            case 's':
                dx = 0;
                dy = taille;
                break;
            case 'q':
                dx = -taille;
                dy = 0;
                break;
            case 'd':
                dx = taille;
                dy = 0;
                break;
        }
    });

    let intervalId = setInterval(update, 100);
}

snake();