# 6070: 월 입력받아 계절 출력하기

month = int(input())
season = ""

if month in [12, 1, 2]:
    season = "winter"
elif month in [3, 4, 5]:
    season = "spring"
elif month in [6, 7, 8]:
    season = "summer"
else:
    season = "fall"

print(season)