function afficherNombres() {
    for (let i = 1; i <= 100; i++) {
        console.log(i);
        if (i % 3 === 0 && i % 5 === 0) {
            console.log("Multiple de 3 et de 5 !");
        } else if (i % 3 === 0) {
            console.log("Multiple de 3 !");
        } else if (i % 5 === 0) {
            console.log("Multiple de 5 !");
        } else if (i === 73) {
            console.log("Le nombre 73 !!!");
        }
    }
}