// Variables globales décrivant l'état du monstre
let nom;
let life;
let money;
let awake = true;

// Fonction d'initialisation du monstre
function init(n, l, m) {
    nom = n;
    life = l;
    money = m;
}

// Fonction pour afficher les propriétés du monstre
function showme() {
    log(`Nom: ${nom}, Vie: ${life}, Argent: ${money}, Réveillé: ${awake}`);
}

// Fonction go() pour initialiser le monstre et enregistrer le handler
function go() {
    // Initialiser le monstre
    init("Monstre", 30, 50);

    displayStatus(life, money, awake);
    // Enregistrer la fonction showme() en tant que handler de l'événement click
    buttonShowMe.addEventListener("click", showme);
}

// Variables globales pour stocker les objets du DOM
let buttonGo;
let buttonShowMe;

// Assigner les objets du DOM aux variables globales
buttonGo = document.getElementById("button-go");
buttonShowMe = document.getElementById("b6");

// Enregistrer la fonction go() en tant que handler de l'événement load de window
window.addEventListener("load", go);

// Définir la fonction log(message)
function log(message) {
    // Récupérer la boîte #actionbox
    const actionBox = document.getElementById("actionbox");

    // Créer un nouvel élément <p> pour le message
    const newMessage = document.createElement("p");
    newMessage.textContent = message;

    // Insérer le nouvel élément en tant que premier fils de la boîte
    actionBox.insertBefore(newMessage, actionBox.firstChild);
}

var statusList = document.getElementById("status");

function displayStatus(life, money, awake) {
    
    statusList.innerHTML = "";

    let Vie = document.createElement("li");
    let VieChar = document.createTextNode("Vie : " + life);
    Vie.appendChild(VieChar);

    let argent = document.createElement("li");
    let argentChar = document.createTextNode("Argent : " + money);
    argent.appendChild(argentChar);

    let reveiller = document.createElement("li");
    let reveillerchar = document.createTextNode("Réveillé : " + awake);
    reveiller.appendChild(reveillerchar);

    statusList.appendChild(Vie);
    statusList.appendChild(argent);
    statusList.appendChild(reveiller);

    // Change the color of the #monster box based on life points
    const monsterBox = document.getElementById("monster");
    if (life < 1) {
        monsterBox.style.backgroundColor = "black";
    } else if (life < 5) {
        monsterBox.style.backgroundColor = "red";
    } else if (life < 10) {
        monsterBox.style.backgroundColor = "orange";
    } else if (life < 15) {
        monsterBox.style.backgroundColor = "blue";
    } else {
        monsterBox.style.backgroundColor = "green";
    }

    // Change the border thickness of the #monster box based on money
    monsterBox.style.borderWidth = money + "px";
}
// Fonction pour exécuter l'action "run"
function run() {
    if (life >= 1 && awake && money >= 0) {
        life -= 1;
        log(`${nom} court et perd 1 point de vie.`);
        displayStatus(life, money, awake);
    } else {
        log(`Impossible de courir.`);
    }
}

// Fonction pour exécuter l'action "fight"
function fight() {
    if (life >= 3 && awake && money >= 0) {
        life -= 3;
        log(`${nom} se bat et perd 3 points de vie.`);
        displayStatus(life, money, awake);
    } else if (life < 3) {
        life = life - life;
        displayStatus(life, money, awake);
    } else {
        log(`Impossible de se battre.`);
    }
}

// Fonction pour exécuter l'action "work"
function work() {
    if (life >= 1 && awake) {
        life -= 1;
        money += 2;
        log(`${nom} travaille, perd 1 point de vie et gagne 2 unités d'argent.`);
        displayStatus(life, money, awake);
    } else {
        log(`Impossible de travailler`);
    }
}

// Fonction pour exécuter l'action "eat"
function eat() {
    if (life >= 0 && awake && money >= 3) {
        life += 2;
        money -= 3;
        log(`${nom} mange, gagne 2 points de vie et perd 3 unités d'argent.`);
        displayStatus(life, money, awake);
    } else {
        log(`Impossible de manger.`);
    }
}

// Associer les actions aux boutons correspondants
let buttonRun = document.getElementById("b2");
buttonRun.addEventListener("click", run);
let buttonFight = document.getElementById("b3");
buttonFight.addEventListener("click", fight);
let buttonWork = document.getElementById("b7");
buttonWork.addEventListener("click", work);
let buttonEat = document.getElementById("b5");
buttonEat.addEventListener("click", eat);
let buttonSleep = document.getElementById("b4");
buttonSleep.addEventListener("click", sleep);

// Fonction pour endormir le monstre
function sleep() {
    if (awake ) {
        if (life >= 1) {
        awake = false;
        log(`${nom} s'endort.`);
        displayStatus(life, money, awake);

        // Programmer le réveil du monstre après 7 secondes
        setTimeout(function() {
            awake = true;
            life += 1;
            log(`${nom} se réveille et gagne 1 point de vie.`);
            displayStatus(life, money, awake);
        }, 7000);
    }else{
        log(`${nom} est mort`);  
    }

    } else {
        log(`${nom} est déjà endormi.`);
    }
}

// Tableau de handlers pour les actions
const actions = [run, fight, work, eat, sleep];

// Fonction pour exécuter une action au hasard
function hasard() {
    const randomIndex = Math.floor(Math.random() * actions.length);
    const randomAction = actions[randomIndex];
    randomAction();
}

// Exécution de la fonction hasard toutes les 12 secondes
setInterval(hasard, 12000);

// Fonction pour exécuter l'action "kill"
function kill() {
    if (life > 0) {
        life = 0;
        log(`${nom} est tué.`);
        displayStatus(life, money, awake);
    } else {
        log(`Il est deja mort.`);
    }
}

// Fonction pour exécuter l'action "newLife"
function newLife() {
    if (life <= 0 && awake && money >= 0) {
        life = 30;
        log(`${nom} a une nouvelle vie.`);
        displayStatus(life, money, awake);
    } else {
        log(`Impossible de le reincarné.`);
    }
}

// Associer les actions aux boutons correspondants
let buttonKill = document.getElementById("k");
buttonKill.addEventListener("click", kill);
let buttonNewLife = document.getElementById("b1");
buttonNewLife.addEventListener("click", newLife);

