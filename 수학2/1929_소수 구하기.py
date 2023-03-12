# 문제
# M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
#
# 입력
# 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
#
# 출력
# 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

import sys


def prime_num(n,m):
    seive = [True] * (m+1)
    seive[1] = False
    sqrt = int(m**0.5)
    for i in range(2,sqrt+1):
        if seive[i] == True:
            for j in range(2*i,m+1,i):
                seive[j] = False
    for i in range(n,m+1):
        if seive[i]==True:
            print(i)


min_num, max_num = map(int, sys.stdin.readline().split())
prime_num(min_num,max_num)