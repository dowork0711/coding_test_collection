/* 
   문제

   숫자로 이루어진 배열이 주어졌을 때, 해당 숫자 배열 안에 있는
   숫자 중 3보다 큰 숫자로만 이루어진 배열을 새로 만들어 반환하라.

   function biggerThanThree(numbers) {
     // 채워넣을 곳
   }

   const numbers = [1, 2, 3, 4, 5, 6, 7]
   console.log(biggerThanThree(numbers)); // [4, 5, 6, 7]
*/

function biggerThanThree(numbers) {
  // 정답 입력
  let myArr = [];
  for(number of numbers) {
    if (numbers > 3) {
      myArr.push(numbers);
    }
  }
}

const numbers = [1, 2, 3, 4, 5, 6, 7];
console.log(biggerThanThree(numbers));