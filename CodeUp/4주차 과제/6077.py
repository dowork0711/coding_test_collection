# 6077: 짝수합 구하기


# 1부터 입력받은 숫자까지 2로 나눴을 때 나누어 떨어지면 리스트에 넣고 다 더해
print(sum([i for i in range(1, int(input())+1) if i % 2 == 0]))
