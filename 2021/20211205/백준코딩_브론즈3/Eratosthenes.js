// 에라토스테네스의 체로 쌍둥이 소수 구하기

let n = parseInt(prompt('write n'));

let p = [];

for (let i=2; i<=n; i++) {
  p[i] = true;
}

let max = Math.floor(Math.sqrt(n));
let x = 2;

while (x <= max) {
  for (let i=2*x; i<=n; i += x) {
    p[i] = false;
  }
  while(!p[++x]);
}

for (let i=2; i<=n-2; i++) {
  if (p[i] && p[i+2]) {
    console.log(`입력한 숫자 ${n}의 쌍둥이 소수는 각각 ${i}, ${i+2}`);
  }
}

