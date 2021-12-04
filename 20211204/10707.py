# 수도요금

## x사 : 1리터당 a엔
## y사 : 
### 사용량 c리터 이하 : 기본요금 b엔
### 사용량 c리터 이상 : 기본요금 b엔 + 추가요금(c리터 초과시 1리터 이상마다 d엔)
## 한달 수도 사용량 p리터

a = int(input())
b = int(input())
c = int(input())
d = int(input())
p = int(input())

x = a * p
y = b if c >=p else b+(d * (p-c))

print(x if x < y else y)
