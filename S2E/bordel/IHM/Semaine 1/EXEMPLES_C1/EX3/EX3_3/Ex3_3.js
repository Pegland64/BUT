function fibonacci(a, b) {
    let unmoins2 = b;
    let unmoins1 = a;
    return () =>{
        un = unmoins1 + unmoins2;
        unmoins2 = unmoins1;
        unmoins1 = un;
        return un;  
    };
}