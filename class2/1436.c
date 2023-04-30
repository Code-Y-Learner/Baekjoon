#include <stdio.h>

int	checkEvil(int num)
{
	int	cnt;

	cnt = 0;
	while (num)
	{
		if (cnt == 3)
			return (1);
		if ((num % 10) % 6 == 0 && num % 10 != 0)
			cnt++;
		else
			cnt = 0;
		num /= 10;
	}
	if (cnt == 3)
		return (1);
	return (0);
}

int	main(void)
{
	int	num;
	int	evilNum;

	scanf("%d", &num);
	evilNum = 666;
	while (num > 0)
	{
		if (checkEvil(evilNum))
			num -= 1;
		evilNum += 1;
	}
	printf("%d\n", evilNum - 1);
	return (0);
}
