function range(a,b){
    let t = new Array();
    if (a>=b){
        while (a>=b){
            t.push(a);
            a--;
        }
    }
    if (a<b){
        while (a<b){
            t.push(a);
            a++;
        }
        t.reverse();
    }
    return t;
}

function sum(t){
    let s = 0;
    for (let i=0; i<t.length; i++){
        s += t[i];
    }
    return s;
}

function sumUsingForEach(t) {
    let s = 0;
    t.forEach((num) => {
        s += num;
    });
    return s;
}

function moy(t){
    let s = sum(t);
    return s/t.length;
}

function moyUsingForEach(t){
    let s = sumUsingForEach(t);
    return s/t.length;
}

function selec(t, pattern){
    let selectedStrings = [];
    for (let i = 0; i < t.length; i++) {
        if (t[i].includes(pattern)) {
            selectedStrings.push(t[i].toUpperCase());
        }
    }
    return selectedStrings;
}