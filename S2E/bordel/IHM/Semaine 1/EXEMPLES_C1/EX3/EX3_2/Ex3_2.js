function creerSequence(init, step) {
    let valeurCourante = init;

    return () => {
        const valeurActuelle = valeurCourante;
        valeurCourante += step;
        return valeurActuelle;
    };
}