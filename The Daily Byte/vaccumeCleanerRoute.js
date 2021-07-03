/*
Good morning,

Today’s Byte
This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings…

"LR", return true
"URURD", return false
"RUULLDRD", return true
 */
const vaccumeCleanerRoute=(str)=>{
  let l=0,r=0,u=0,d=0;
  for(let s of [...str]){
    console.log(s)
    if(s === "L"){
      l++;
      r--;
    }else if(s=="R"){
      l--;
      r++;
    }else if(s=="U"){
      u++;
      d--;
    }else if(s=="D"){
      d++;
      u--;
    }
  }
  console.log("l,r,u,d",l,r,u,d)
  return l==0 && r==0 && u==0 && d==0;
}

vaccumeCleanerRoute("RUULLDRD")