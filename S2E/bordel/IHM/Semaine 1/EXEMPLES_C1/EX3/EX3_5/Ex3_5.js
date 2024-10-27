function formatter(s) {
    let c = s;

    return (message) => {
        let b = c + ": " + message
        c++;
        return b;
    };
}

var format = formatter(10);
console.log(format('le ciel est slanc'));
console.log(format('la neige est sleue'));