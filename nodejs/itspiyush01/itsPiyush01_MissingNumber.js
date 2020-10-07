/*
You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
Link      : https://cses.fi/problemset/task/1083
Author    : Piyush Ranjan 
GitHub_Id : itsPiyush01
Profile   : https://cses.fi/user/32379
*/

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let arr = [];
var n;
rl.question("", (X) => {
  n = X;
  rl.on("line", (numbs) => {
    arr.push(numbs.split(" "));
    rl.close();
  });
});

rl.on("close", () => {
  arr = arr.join().split(",");
  let xor = 0;
  for (let i = 0; i < n - 1; i++) {
    xor ^= arr[i];
    xor = xor ^ (i + 1);
  }
  xor = xor ^ n;
  console.log(xor);
});
