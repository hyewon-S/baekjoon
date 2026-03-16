d = list(map(int, input().split()))

if 2 * max(d) < sum(d):
    print(sum(d))
else:
    print(2 * (sum(d) - max(d)) - 1)

    #sort 함수로 세 수를 정렬하기도 하는데...
    # 변수 여러개 쓰는게 싫음..
    #어차피 제일 큰 수만 필요하므로,
    # 전체 합에서 큰수를 뺌 -> 나머지 두 수의 합
    # sum(d) - max(d)