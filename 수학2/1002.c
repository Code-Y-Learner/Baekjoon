#include <stdio.h>

#define MIN(x, y) ( (x <= y) ? (x) : (y) )

int	main(void)
{
	int	num;
	int	i, d1;
	int	x1,y1,x2,y2,r1,r2;

	scanf("%d", &num);
	i = 0;
	while (i < num)
	{
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		d1 = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		if (d1 == 0 && r1 == r2)
		{
			printf("-1\n");
			i++;
			continue ;
		}
		if (MAX(r1, r2)*MAX(r1, r2) > d1)
		{
			if (d1 == (r2 - r1)*(r2 - r1))
				printf("1\n");
			else if (d1 > (r2 - r1)*(r2 - r1))
				printf("2\n");
			else
				printf("0\n");
		}
		else
		{
			if (d1 < (r1 + r2)*(r1 + r2))
				printf("2\n");
			else if (d1 == (r1 + r2)*(r1 + r2))
				printf("1\n");
			else
				printf("0\n");
		}
		i++;
	}
	return (0);
}
