#include <stdio.h>

int	find_min(int *arr, int end)
{
	int	i;
	int	min;

	i = 0;
	min = 2147483647;
	while (i < end)
	{
		if (arr[i] < min)
			min = arr[i];
		i++;
	}
	return (min);
}

int	find_max(int *arr, int end)
{
	int	i;
	int	max;

	i = 0;
	max = 0;
	while (i < end)
	{
		if (arr[i] > max)
			max = arr[i];
		i++;
	}
	return (max);
}

int	check2(int *arr, int max, int end, int object)
{
	int	i;
	int	result;

	while (1)
	{
		i = 0;
		result = 0;
		while (i < end)
			result += (arr[i++] / max);
		if (result < object)
			max--;
		else
			break;
	}
	return (max);
}

int	check(int *arr, int min, int end, int object)
{
	int	i;
	int	result;
	int	cnt;

	cnt = 0;
	while (1)
	{
		i = 0;
		result = 0;
		while (i < end)
			result += (arr[i++] / min);
		if (result < object)
		{
			cnt = 1;
			min--;
		}
		else
			break ;
	}
	if (cnt == 0)
		min = check2(arr, find_max(arr, end), end, object);
	return (min);
}

int	main(void)
{
	int	lineNum;
	int	object;
	int	j;
	int	i;

	i = 0;
	scanf("%d %d", &lineNum, &object);
	int	arr[lineNum];
	while (i < lineNum)
	{
		scanf("%d", &arr[i]);
		i++;
	}
	printf("%d" ,check(arr, find_min(arr, lineNum), lineNum, object));
	return (0);
}
