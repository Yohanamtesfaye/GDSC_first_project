function oddNum(n){
  const odd = []
  for(let i =0;i<=n;i++){
    if(i%2!=0){
      console.log(i);
    }
  }
}
let y = prompt("enter a number: ");
oddNum(y);