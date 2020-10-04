/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

Link      : https://cses.fi/problemset/task/1094/
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
let n;
rl.question("", (X) => {
  n = X;
  rl.on("line", (numbs) => {
    arr.push(numbs.split(" "));
    rl.close();
  });
});

rl.on("close", () => {
  var turns = 0;

  arr = arr.join().split(",");

  for (let i = 1; i < n; i++) {
    if (parseInt(arr[i - 1]) > parseInt(arr[i])) {
      turns = turns + (arr[i - 1] - arr[i]);
      arr[i] = arr[i - 1];
    }
  }

  console.log(turns);
});
