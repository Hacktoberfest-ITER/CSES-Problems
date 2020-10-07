/*
Your task is to calculate the number of trailing zeros in the factorial n!.
For example, 20!=2432902008176640000 and it has 4 trailing zeros.

Link      : https://cses.fi/problemset/task/1618
Author    : Piyush Ranjan
GitHub_Id : itsPiyush01
Profile   : https://cses.fi/user/32379
*/

const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

let n;
readline.question("", (X) => {
  n = parseInt(X);
  readline.close();
});

readline.on("close", () => {
  let count = 0;
  for (let i = 5; n / i >= 1; i = i * 5) {
    count = count + Math.floor(n / i);
  }
  console.log(count);
});
