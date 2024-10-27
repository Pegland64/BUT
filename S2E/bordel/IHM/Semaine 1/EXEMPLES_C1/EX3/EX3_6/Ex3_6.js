let affichage = (function afficher(x){
    let msg = "Bonjour";
    return (pas) => {x+=pas; console.log(msg+" "+x+" fois");}
})(1);

affichage(10);
affichage(1);
