# 문제
# 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
#
# 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
#
# 입력
# 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
#
# M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
#
# 출력
# M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
#
# 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

# import sys
# import math
#
# def is_prime_number(x):
#     if x ==1:
#         return
#     for i in range(2, int(math.sqrt(x))+1 ):
#         if x % i == 0:
#             return
#     return x
#
# M = int(sys.stdin.readline())
# N = int(sys.stdin.readline())
# ans = []
# for i in range(M,N+1):
#     if is_prime_number(i):
#         ans.append(i)
#
# if ans:
#     print(sum(ans))
#     print(ans[0])
# else:
#     print("-1")


# 더 빠른 풀이 주어진 수에서 소수의 배수를 모조리 빼자
import sys

def is_prime_number2(M,N):
    seive = [True] * (N+1)
    seive[0] = False
    seive[1] = False
    m = int(N ** 0.5)
    for i in range(2,m+1):
        if seive[i] == True:
            for j in range(2*i,N+1,i):
                seive[j] = False
    ans = []
    for i in range(M,N+1):
        if seive[i]==True:
            ans.append(i)
    if ans:
        print(sum(ans))
        print(ans[0])
    else:
        print("-1")

M = int(sys.stdin.readline())
N = int(sys.stdin.readline())

is_prime_number2(M,N)

