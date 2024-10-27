'use strict'

// Teste la parite des clics
let premier_clic = true; 

// Pour stocker l'image choisie lors du premier et second clic
let premiere_image;

const images = document.getElementsByTagName('img');

// Traite le clic, evenement ev, effectue sur l'objet image 'ima'.
function clic(ev){
	let ima=ev.target;
    if (premier_clic) {
        premiere_image = ima;
    }
    else {
        let src = premiere_image.src;
        premiere_image.src = ima.src;
        ima.src = src;
    }

    premier_clic = !premier_clic;
}
    // Associe la fonction clic à tous les éléments img
    for (let i = 0; i < images.length; i++) {
        images[i].onclick = clic;
    }