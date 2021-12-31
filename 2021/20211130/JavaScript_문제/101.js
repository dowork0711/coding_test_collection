/* 
   문제

   숫자로 이루어진 배열이 주어졌을 때, 10보다 큰 숫자의 개수를 반환하라.

   function biggerThanTen(numbers) {
     // 채워넣을 곳
   }

   const count = countBiggerThanTen([1, 2, 3, 5, 10, 20, 30, 40, 50, 60]);
   console.log(count); // 5
*/

function biggerThanTen(numbers) {
  let count = 0;
  numbers.forEach(n => {
    if (n > 10) {
      count++;
    }
  });
  return count;
}

const count = countBiggerThanTen([1, 2, 3, 5, 10, 20, 30, 40, 50, 60]);
console.log(count); // 5