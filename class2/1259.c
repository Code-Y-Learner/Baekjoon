#include <stdio.h>

size_t	ft_strlen(const char *str)
{
	size_t	i;

	i = 0;
	while (str[i])
		i++;
	return (i);
}

int	main(void)
{
	char	str[6];
	size_t	i;
	size_t	len;

	while (1)
	{
		i = 0;
		scanf("%s", str);
		len = ft_strlen(str);
		if (ft_strlen(str) == 1 && *str == '0')
			break;
		else
		{
			while (i < len / 2 && str[i] == str[len - i - 1])
			{
				i++;
			}
		}
		if (i == len / 2)
			printf("yes\n");
		else
			printf("no\n");
	}
	return (0);
}
