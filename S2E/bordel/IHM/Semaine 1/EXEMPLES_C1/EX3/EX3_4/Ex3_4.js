function creerMultiplicateur(n, x) {
    if (arguments.length === 1) {
        return (y) => {
            return n * y;
        };
    } else if (arguments.length === 2) {
        return n * x;
    }
}