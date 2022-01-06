# 6074: 문자 1개 입력받아 알파벳 출력하기

asc = ord(input())
temp = ord('a')
while asc >= temp:
    print(chr(temp), end=" ")
    temp += 1