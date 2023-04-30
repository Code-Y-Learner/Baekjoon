#include <stdio.h>

int	sum(int num)
{
	int	result;

	result = num;
	while (num)
	{
		result += num % 10;
		num /= 10;
	}
	return (result);
}

int	main(void)
{
	int	i;
	int	num;

	scanf("%d", &num);
	i = 1;
	while (1)
	{
		if (sum(i) == num)
			break;
		if (i == num)
		{
			printf("0");
			return (0);
		}
		i++;
	}
	printf("%d", i);
	return (0);
}
