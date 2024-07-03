def solution(numbers):
    numbers_sum = []
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            numbers_sum.append(numbers[i]+numbers[j])
    return sorted(list(set(numbers_sum)))