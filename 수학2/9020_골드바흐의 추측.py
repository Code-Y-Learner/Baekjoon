# 문제
# 1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
#
# 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
#
# 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
#
# 입력
# 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
#
# 출력
# 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.

# import sys
#
# iter = int(sys.stdin.readline())
#
# num_list = [int(sys.stdin.readline()) for i in range(iter)]
# x= max(num_list)
# temp = [True]*(x+1)
# temp[0] = False
# temp[1] = False
# sqrt = int(x**0.5)+1
# for i in range(2,sqrt):
#   if temp[i] == True:
#     for j in range(2*i,x+1,i):
#       temp[j] = False
# sosu = [i for i in range(len(temp)) if temp[i]== True]
# for num in num_list:
#   answer = []
#   for i in range(len(sosu)):
#     for j in sosu[i:]:
#       if sosu[i]+j == num:
#         answer.append(sosu[i])
#         answer.append(j)
#   temp2=[]
#   for i in range(0,len(answer),2):
#     temp2.append(answer[i+1]-answer[i])
#   temp2_index = temp2.index(min(temp2))
#   print(f"{answer[temp2_index*2]} {answer[temp2_index*2+1]}")

# 접근방식이 비효율적임 모든 소수를 구하고 그에 따른 차이가 제일 적은 수를 찾는 방법

### 바뀐 방법
# 제시된 짝수에 대해서 2로 나눈 수를 양쪽에 +1, -1을 진행하면서 양쪽이 소수인지 확인

import sys

iter = int(sys.stdin.readline())

def is_sosu(x):
    for i in range(2,int(x**0.5)+1):
        if x % i ==0:
            return False
    return True

for _ in range(iter):
    num = int(sys.stdin.readline())
    for i in range(0,int(num/2)-1):
        if (is_sosu(num/2-i)) and (is_sosu(num/2+i)):
            print(f"{int(num/2-i)} {int(num/2+i)}")
            break