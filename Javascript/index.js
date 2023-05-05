
let name1 = "Tunç";
let age = 24;
let isStudent = false;
document.getElementById("p1").innerHTML = "Hello " , name1;
document.getElementById("p2").innerHTML = "You are "+age;
document.getElementById("p3").innerHTML = "Is student: "+isStudent;

 // let username = window.prompt("Whats your name?");
 // console.log(username);
let username;
document.getElementById("myButton").onclick = function(){
    username = document.getElementById("myText").value;
    console.log(username);
}
let count = 0;
document.getElementById("increase").onclick = function(){
    count += 1;
    document.getElementById("count").innerHTML = count;
}
document.getElementById("decrease").onclick = function(){
    count -= 1;
    document.getElementById("count").innerHTML = count;
}
document.getElementById("reset").onclick = function(){
    count = 0;
    document.getElementById("count").innerHTML = count;
}
let rollldice = 0
document.getElementById("roll1").onclick = function(){
    rollldice =Math.round( Math.random() * 100);
    document.getElementById("roll").innerHTML = rollldice;

}

