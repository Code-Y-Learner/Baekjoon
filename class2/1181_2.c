#include <stdio.h>

typedef struct
{
	char	str[55];
}	t_str;

t_str	sort[20001];

int	ft_strlen(const char *word)
{
	int	i;

	i = 0;
	while (word[i])
		i++;
	return (i);
}

int	ft_strcmp(const char *s1,const char *s2, int n)
{
	int		i;

	i = 0;
	while (i < n && !(s1[i] == '\0' && s2[i] == '\0'))
	{
		if (s1[i] == s2[i])
			i++;
		else
			return ((unsigned char)s1[i] - (unsigned char)s2[i]);
	}
	return (0);
}

void	ft_strcpy(char *dest, const char *src)
{
	int	i;

	i = 0;
	while (src[i] != '\0')
	{
		dest[i] = src[i];
		i++;
	}
	dest[i] = '\0';
}

int	compare(const char *s1,const char *s2)
{
	const int len1 = ft_strlen(s1);
	const int len2 = ft_strlen(s2);

	if (len1 != len2)
		return (len2 - len1);
	else
		return (-(ft_strcmp(s1, s2, 51)));
}

void	merge_sort(t_str *words, int start, int middle, int end)
{
	int	i = start;
	int	j = middle + 1;
	int	k = start;
	while (i <= middle && j <= end)
	{
		if (compare(words[i].str, words[j].str) >= 0)
		{
			sort[k] = words[i];
			i++;
		}
		else
		{
			sort[k] = words[j];
			j++;
		}
		k++;
	}
	if (i > middle)
		for (int t = j; t <= end; t++)
		{
			sort[k] = words[t];
			k++;
		}
	else 
	{
		for (int t = i; t <= middle; t++)
		{
			sort[k] = words[t];
			k++;
		}
	}
	for (int t = start; t <= end; t++)
	{
		words[t] = sort[t];
	}
}

void	merge_sort2(t_str *words, int start, int end)
{
	if (start < end)
	{
		int middle = (start + end) / 2;
		merge_sort2(words, start, middle);
		merge_sort2(words, middle + 1, end);
		merge_sort(words, start, middle, end);
	}
}

int	main(void)
{
	int		num;
	t_str	words[20001];
	int		i;

	scanf("%d", &num);
	i = 0;
	for (i = 0; i < num; i++)
	{
		scanf("%s", words[i].str);
	}
	merge_sort2(words, 0,  num - 1);
	t_str	tmp = words[0];
	printf("%s\n", words[0].str);
	for (i = 1; i < num; i++)
	{
		if (ft_strcmp(words[i].str, tmp.str, 51) == 0)
			continue ;
		ft_strcpy(tmp.str, words[i].str);
		printf("%s\n", words[i].str);
	}
	return (0);
}
