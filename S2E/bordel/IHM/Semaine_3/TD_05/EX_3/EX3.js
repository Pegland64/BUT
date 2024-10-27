let erreur1 = false;
let erreur2 = false;
function bonChoix() {
    let erreur = true;
    // Vérifier si exactement 2 groupes ont été choisis
    const groupes = document.querySelectorAll('input[type="checkbox"]:checked');
    if (groupes.length !== 2) {
        erreur1 = true;
        erreur = false;
    }
    // Vérifier si toutes les zones de texte sont remplies
    const zonesTexte = document.querySelectorAll('input[type="text"]');
    for (let i = 0; i < zonesTexte.length; i++) {
        if (zonesTexte[i].value.trim() === "") {
            erreur2 = true;
            erreur = false;
        }
    }
    if (erreur1) {
        alert("Veuillez choisir exactement 2 groupes !");
    }
    if (erreur2) {
        alert("Veuillez remplir toutes les zones de texte !");
    }
// Si toutes les conditions sont remplies, afficher le récapitulatif
    if (erreur) {
        let recapitulatif = "Récapitulatif des choix :<br>";
        recapitulatif += "Groupes choisis :<br> ";
        groupes.forEach((groupe) => {
            if(groupe.checked) {

                
                recapitulatif += groupe.value + " ";
            }
        });
        recapitulatif += "<br>Zones de texte remplies : ";
        zonesTexte.forEach((zone) => {
            recapitulatif += zone.value + " ";
        });

        // Ouvrir une nouvelle fenêtre/page avec le récapitulatif et les boutons de validation
        const newWindow = window.open("", "_blank");
        newWindow.document.write("<h1>Récapitulatif des choix</h1>");
        newWindow.document.write("<p>" + recapitulatif + "</p>");
        newWindow.document.write('<button onclick="validerFormulaire(true)">Oui</button>');
        newWindow.document.write('<button onclick="validerFormulaire(false)">Non</button>');
    }
}

function validerFormulaire(envoyer) {
    if (envoyer) {
        // Envoyer le formulaire
        alert("Formulaire envoyé !");
    } else {
        // Ne pas envoyer le formulaire
        alert("Formulaire non envoyé !");
    }
    

    // Si toutes les conditions sont remplies, retourner true
    return erreur;
}

document.getElementById('envoyer').addEventListener('click', bonChoix);

document.getElementById('Effacer').addEventListener('click', function() {
    reset();
});
