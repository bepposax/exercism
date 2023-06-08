#include "square_root.h"

int square_root(int radicand)
{
    int n = 0, powers_of_n = 0, diff = 1;

    do
    {
        powers_of_n += diff;
        diff += 2;
        n++;
    } while (powers_of_n < radicand);

    return n;
}