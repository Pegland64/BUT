function creerMultiplicateur(n) {
    return (x) => n * x;
}

console.log(creerMultiplicateur(2)(3));