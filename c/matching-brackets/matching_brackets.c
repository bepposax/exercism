#include "matching_brackets.h"
#include <ctype.h>
#include <string.h>

bool is_paired(const char *input)
{
    char pattern[strlen(input)], b[] = "{[()]}";
    int i = 0, j;

    while (*input)
    {
        j = 0;
        while (b[j])
            if (*input == b[j++])
            {
                pattern[i] = *input;
                i++;
                break;
            }
        input++;
    }

    pattern[i] = '\0';

    if (strlen(pattern) % 2 == 1)
        return false;

    char *right = pattern + strlen(pattern) / 2, *left = right - 1;

    while (*right)
    {
        for (i = 0; i < 3; i++)
        {
            if ((*right == b[3 + i] && *left != b[2 - i]) || *right == b[2 - i])
                return false;
        }
        right++;
        left--;
    }
    return true;
}