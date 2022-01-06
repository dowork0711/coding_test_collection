# 6079: 언제까지 더해야 할까?

num = int(input())          # 입력받아

sum = 0                     # 더해줄 값
rep = 0                     # i를 담아줄 값

for i in range(1, num):     # 1부터 입력받은 값까지 돌아
    sum += i                # sum에다 sum + i를 밀어넣어(계속 더해)
    rep = i                 # 이 때 i가 rep가 되는거야
    if sum >= num:          # 근데 sum이 입력받은 숫자보다 크거나 같을 때
        print(rep)          # i를 보여주고
        break               # 멈춰!!

'''
num = int(input().rstrip())

for i in range(0, 1000):
    if (i * (i+1)) // 2 >= num:
        print(i)
        break
'''