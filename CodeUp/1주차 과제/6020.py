# 주민번호 입력받아 형태 바꿔 입력하기

# 나의 풀이
idNum = input().split('-')    # 한번에 입력받아서 -로 구분 => 배열화 됨
print(idNum[0], idNum[1], sep='') # 배열 0번째 1번째 띄어쓰기 없이 출력

# 또 다른 답
# p, q = map(str, input().split('-'))
# print(p, q, sep='')

# a, b = input().split('-')
# print(f'{a}{b}')

# a, b = input().split('-')
# print(a + b)