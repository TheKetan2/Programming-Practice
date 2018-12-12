function isOneSwapEnough(inputString) {
    let f = new Array(26).fill(0);
    for (let i = 0; i < inputString.length; i++) {
        f[inputString.charCodeAt(i) - 'a'.charCodeAt()]++;
    }
    console.log(f);
    let countOdd = 0;
    for (let i = 0; i < 26; i++) {
        if (f[i] % 2) countOdd++;
    }
    if (countOdd > 1) return false;
    let countDiff = 0;
    for (let i = 0; i < inputString.length / 2; i++) {
        if (inputString[i] != inputString[inputString.length - 1- i]) countDiff++;
    }
    if (countDiff > 2) return false;
    return true;
}

/////////////////////////////////////////
int equalPairOfBits(int n, int m) {
    return Integer.lowestOneBit(~(n^m));
  
  }

  ///////////////////////////////////////
  String caesarBoxCipherEncoding(String inputString) {
    int s = (int)Math.sqrt(inputString.length());
    String sol = "";
    for(int i = 0; i<s; i++){
    for(int j = i; j<inputString.length(); j+=s){
    sol += inputString.charAt(j)+"";
    }

    }
    return sol;
}

///////////////////////////////////////////