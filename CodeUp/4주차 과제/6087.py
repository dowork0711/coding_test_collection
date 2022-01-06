# 6087: 3의 배수는 통과

print(*[i for i in range(1, int(input())+1) if i%3 != 0])
# print(' '.join(map(str, li)))

# print(' '.join(map(str, [x for x in range(1, int(input().rstrip()) + 1) if x % 3 != 0])))