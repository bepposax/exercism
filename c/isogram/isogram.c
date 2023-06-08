#include "isogram.h"

bool is_isogram(const char phrase[])
{
    if (phrase == NULL)
        return false;
    if (strlen(phrase) < 2)
        return true;

    char a[] = "abcdefghijklmnopqrstuvwxyz";

    do
    {
        if (isalpha(*phrase))
        {
            if (a[tolower(*phrase) - 'a'])
                a[tolower(*phrase) - 'a'] = '\0';
            else
                return false;
        }
    } while (*phrase++);

    return true;
}