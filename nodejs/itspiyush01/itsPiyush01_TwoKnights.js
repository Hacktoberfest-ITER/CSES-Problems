/*
Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a k×k chessboard so that they do not attack each other.

Link      : https://cses.fi/problemset/task/1072/
Author    : Piyush Ranjan
GitHub_Id : itsPiyush01
Profile   : https://cses.fi/user/32379
*/

const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

let n;

function TwoKnights(n) {
  th = 4 * (n - 1) * (n - 2);
  pos = (n * n * (n * n - 1)) / 2;
  return pos - th;
}

readline.question("", (X) => {
  n = parseInt(X);

  for (let i = 1; i <= n; i++) {
    console.log(TwoKnights(i));
  }
  readline.close();
});
