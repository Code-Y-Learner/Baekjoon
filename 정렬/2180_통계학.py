# 문제
# 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
#
# 산술평균 : N개의 수들의 합을 N으로 나눈 값
# 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
# 최빈값 : N개의 수들 중 가장 많이 나타나는 값
# 범위 : N개의 수들 중 최댓값과 최솟값의 차이
# N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
#
# 입력
# 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
#
# 출력
# 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
#
# 둘째 줄에는 중앙값을 출력한다.
#
# 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
#
# 넷째 줄에는 범위를 출력한다.

# import sys
#
# N = int(sys.stdin.readline())
# num_list = sorted(list(map(int,sys.stdin.read().split())))
#
# dic = {x : num_list.count(x) for i ,x in enumerate(num_list)}
# dic2 = sorted(dic.items(), key = lambda item: item[1] ,reverse=True)
# print(int(round(sum(num_list)/N,0)))
# print(num_list[int(N/2)])
# print(''.join(map(str,[dic2[i][0] for i in range(0,2) if dic2[i][1] != dic2[i+1][1] or i == 1 ])))
# print(abs(num_list[N-1]-num_list[0]))


## 시간초과 : 했던 방법 dict로 개수를 저장해서 사용하자
## Collections 를 통해 시간복잡도 O(N)으로 축소

import sys
from collections import Counter

N = int(sys.stdin.readline())
num_list = sorted(list(map(int,sys.stdin.read().split())))
count = Counter(num_list).most_common()
print(int(round(sum(num_list)/N)))
print(num_list[int((N-1)/2)])
if len(count)>1:
    print(''.join(map(str,[count[0][0] if count[0][1] != count[1][1] else count[1][0] ])))
else:
    print(count[0][0])
print(num_list[-1]-num_list[0])

