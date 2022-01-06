# 6068: 점수 입력받아 평가 출력하기

score = int(input())

if score >= 90:
    print("A")
elif score <= 89 and score >= 70:
    print("B")
elif score <= 69 and score >= 40:
    print("C")
else:
    print("D")