/*
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. 

link   : https://cses.fi/problemset/task/1068

author : Piyush Ranjan 
Profile: https://cses.fi/user/32379
*/

const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

readline.question("", (n) => {
	console.log(n);

  while (n !== 1  && n>1) {
    if (n % 2 === 0) {
      n /= 2;
      console.log(n);
    } else {
      n *= 3;
      n += 1;

      console.log(n);
    }
  }

  readline.close();
});




