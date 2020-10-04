/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character. 
 * Link :https://cses.fi/problemset/task/1069/
 * Author : Piyush Ranjan
 * Profile: https://cses.fi/user/32379
 * GitHub_Id: itsPiyush01
 */

const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

readline.question("", (str) => {
  let count = 1;
  let s = 0;
  for (let i = 1; i < str.length; i++) {
    if (str[i - 1] == str[i]) {
      count++;
    } else {
      s = Math.max(s, count);
      count = 1;
    }
  }
  s = Math.max(s, count);
  console.log(s);

  readline.close();
});