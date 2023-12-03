let counter = document.getElementById("intro");
let num =0;
let incre = document.getElementById("incre");
let decre = document.getElementById("decre");
incre.addEventListener("click", function(){
  num++;
  counter.innerText = num;
})
decre.addEventListener("click", function(){
  num--;
  counter.innerText = num;
})
