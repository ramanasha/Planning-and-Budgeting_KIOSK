var add1 = (function () {
    var counter = 0;
    return function () {return counter += 1;}
})();

function myFunction1(){
    document.getElementById("demo1").innerHTML = add1();
}
</script>

<script>
var add2 = (function () {
    var counter = 0;
    return function () {return counter += 1;}
})();
function myFunction2(){
    document.getElementById("demo2").innerHTML = add2();
}
</script>

<script>
var add3 = (function () {
    var counter = 0;
    return function () {return counter += 1;}
})();
function myFunction3(){
    document.getElementById("demo3").innerHTML = add3();
}
</script>

<script>
var add4 = (function () {
    var counter = 0;
    return function () {return counter += 1;}
})();
function myFunction4(){
    document.getElementById("demo4").innerHTML = add4();
}
