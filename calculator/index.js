let res = document.querySelector("h1");
let sub = document.getElementById("sub");
let add = document.getElementById("add");
let div = document.getElementById("div");
let mul = document.getElementById("multi");
sub.addEventListener("click", function(){
  let userInput = document.getElementById('userInput').value;
  let userInput2 = document.getElementById('userInput2').value;
  let result = userInput - userInput2;
  res.innerText = result;
})
add.addEventListener("click", function(){
  let userInput = document.getElementById('userInput').value;
  let userInput2 = document.getElementById('userInput2').value;
  let result = parseInt(userInput) + parseInt(userInput2);
  res.innerText = result;
})
div.addEventListener("click", function(){
  let userInput = document.getElementById('userInput').value;
  let userInput2 = document.getElementById('userInput2').value;
  let result = userInput / userInput2;
  res.innerText = result;
})
mul.addEventListener("click", function(){
  let userInput = document.getElementById('userInput').value;
  let userInput2 = document.getElementById('userInput2').value;
  let result = userInput * userInput2;
  res.innerText = result;
})