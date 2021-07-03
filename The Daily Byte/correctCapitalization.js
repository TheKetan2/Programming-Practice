/*
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings…

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/
const correctCapitalization=(str)=>{
  if(str.toUpperCase()==str || str.toLowerCase() == str){
    return true;
  }else if(str[0].toUpperCase() == str[0] ){
    if(str.substr(1) == str.substr(1).toUpperCase() || str.substr(1) == str.substr(1).toLowerCase() ){
      return true
    }else{
      return false;
    }
  }else{
    return false;
  }
}

correctCapitalization("compUter")
