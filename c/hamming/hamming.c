#include "hamming.h"

int compute(const char *lhs, const char *rhs)
{
    if (strlen(lhs) != strlen(rhs))
        return -1;
    int hd = 0;
    do
    {
        if (*lhs != *rhs)
            hd++;
    } while (*lhs++ && *rhs++);
    return hd;
}