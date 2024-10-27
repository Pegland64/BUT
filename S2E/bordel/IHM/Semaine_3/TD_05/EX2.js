function incrInputValue() {
    var input = document.querySelector("#ex4i");
    var value = parseInt(input.value);
    input.value = value + 1;
}

var button = document.querySelector("#ex4b");
button.addEventListener("click", incrInputValue);