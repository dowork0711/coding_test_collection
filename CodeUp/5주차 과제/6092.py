# 6092: 이상한 출석 번호 부르기

n = int(input())
li = list(map(int, input().split()))
res = list(0 for _ in range(23))        # 0 ~ 22까지 0으로 채워주기

for i in li:                            # li안의 원소들에 대해
    res[i-1] += 1                       # res의 i-1번째 원소에 1씩 더함

print(res)
print(" ".join(repr(i) for i in res))

# repr은 배열의 원소가 정수형이므로 이를 문자열로 바꾸기 위해 사용
# print(res)만 하면 배열이 출력됨.