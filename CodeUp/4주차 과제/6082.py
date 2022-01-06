# 6082: 3 6 9 게임의 왕이 되자

num = int(input())

for i in range(1, num+1):
    if i % 10 == 3 or i % 10 == 6 or i % 10 == 9:
        print("X", end=' ')
    else:
        print(i, end=' ')

''' else가 없다??!!
int1 = int(input())

for i in range(1, int1+1) : 
    if (i%10==3 or i%10==6 or i%10==9) :
        i = 'X'
    print(i, end=' ')
'''