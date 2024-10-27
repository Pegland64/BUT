function aleArt() {
    const canvas = document.getElementById('canvas');
    const ctx = canvas.getContext('2d');
    
    // Effacer le canvas
    // Demander à l'utilisateur le nombre de rectangles à générer
const numberOfRectangles = prompt("Enter the number of rectangles to generate:");

for (let i = 0; i < numberOfRectangles; i++) {
    // Générer des valeurs aléatoires pour la taille, la couleur et la position
    const width = Math.random() * 100;
    const height = Math.random() * 100;
    const red = Math.floor(Math.random() * 256);
    const green = Math.floor(Math.random() * 256);
    const blue = Math.floor(Math.random() * 256);
    const alpha = Math.random();
    const x = Math.random() * (canvas.width - width);
    const y = Math.random() * (canvas.height - height);
    
    // Dessiner le rectangle
    ctx.fillStyle = `rgba(${red}, ${green}, ${blue}, ${alpha})`;
    ctx.fillRect(x, y, width, height);
}
}

// Appeler la fonction aleArt lorsque l'utilisateur clique sur le canvas
const canvas = document.getElementById('canvas');
canvas.addEventListener('click', aleArt);

// Demander à l'utilisateur le nombre de rectangles à générer
const numberOfRectangles = prompt("Enter the number of rectangles to generate:");

for (let i = 0; i < numberOfRectangles; i++) {
    // Générer des valeurs aléatoires pour la taille, la couleur et la position
    const width = Math.random() * 100;
    const height = Math.random() * 100;
    const red = Math.floor(Math.random() * 256);
    const green = Math.floor(Math.random() * 256);
    const blue = Math.floor(Math.random() * 256);
    const alpha = Math.random();
    const x = Math.random() * (canvas.width - width);
    const y = Math.random() * (canvas.height - height);
    
    // Dessiner le rectangle
    ctx.fillStyle = `rgba(${red}, ${green}, ${blue}, ${alpha})`;
    ctx.fillRect(x, y, width, height);
}

