function getMessageDuJour() {
    const date = new Date();
    const jourCourant = date.getDay();

    switch (jourCourant) {
        case 1: // Lundi
            return "Dur le lundi !";
        case 6: // Samedi
            return "C'est le week-end !";
        case 0: // Dimanche
            return "C'est le week-end !";
        default: // Autres jours de la semaine
            return "Pleine semaine : au travail !";
    }
}

function stats(t){
    let stats = {
        ne : t.length,
        somme : sum(t),
        moyenne : moy(t)
    };
    return stats;
}

console.log(stats(range(1,10)))