#include <stdio.h>

typedef struct
{
	char	str[55];
}	t_str;


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

void	quick_sort(t_str *words, int start, int end)
{
	t_str	tmp;

	if (start >= end)
		return ;
	int key = start;
	int i = start + 1;
	int j = end;
	while (i <= j)
	{
		while (i <= end && compare(words[i].str, words[key].str) >= 0)
			i++;
		while (j > start && compare(words[j].str, words[key].str) <= 0)
			j--;
		if (i > j)
		{
			tmp = words[j];
			words[j] = words[key];
			words[key] = tmp;
		}
		else
		{
			tmp = words[j];
			words[j] = words[i];
			words[i] = tmp;
		}
	}
	quick_sort(words, start, j - 1);
	quick_sort(words, j + 1, end);
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
	quick_sort(words, 0,  num - 1);
	char	tmp[55] = "";
	for (i = 0; i < num; i++)
	{
		if (ft_strcmp(words[i].str, tmp, 51) == 0)
			continue ;
		ft_strcpy(tmp, words[i].str);
		printf("%s\n", words[i].str);
	}
	return (0);
}
