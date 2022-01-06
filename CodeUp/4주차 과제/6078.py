# 6078: 원하는 문자가 입력될 때까지 반복 출력하기

while True:
    alphabet = input()      # True일 때까지 입력받아
    print(alphabet)         # True일 때까지 출력해
    if alphabet == 'q':     # 근데 있잖아 입력받은데 q면 멈춰!
        break

'''
arr = []
char = ''

while 1:
    char = input()
    arr.append(char)

    if char == 'q':
        break

for arr_char in arr:
    print(arr_char)
'''