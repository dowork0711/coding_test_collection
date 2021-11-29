function solution(lottos, win_nums) {
  // 결과를 저장하는 배열
  var answer = [];

  // 민우가 구매한 로또번호 배열에서 당첨번호와 일치하는 번호를 필터링하여 개수를 구함
  const correctNum = lottos.filter((num) => win_nums.includes(num)).length;

  // 민우가 구매한 로또 번호 배열에서 0의 개수를 찾음
  const zeroNums = lottos.filter((num) => num === 0).length;

  // 콘솔에서 확인해주고!
  console.log(correctNum, zeroNums);

  // 최고 순위 번호의 개수와 최저 순위 번호의 개수를 구해서
  let minimum = 7 - correctNum >= 6 ? 6 : 7 - correctNum;
  let maximum = minimum - zeroNums < 1 ? 1 : minimum - zeroNums;

  // 변수에 넣어주고 리턴~~
  answer = [maximum, minimum];

  return answer;
}
