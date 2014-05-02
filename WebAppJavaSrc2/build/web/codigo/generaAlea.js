
function numeAleatorio(num) {  
    var dec = 2;
    var result = Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec)*Math.random();
    return result;
}

function actualiceNum(mul, mul2) {
    document.getElementById('alea1').innerHTML = numeAleatorio(5*mul);
    document.getElementById('alea2').innerHTML = numeAleatorio(10*mul);
    document.getElementById('alea3').innerHTML = numeAleatorio(20*mul2);
    document.getElementById('constante').innerHTML = 50*mul2;
    document.getElementById(P)
    
    
}
function primerConjun() {
        actualiceNum(2, 5);
}

function segunConjun() {
  
        actualiceNum(4, 1);
}