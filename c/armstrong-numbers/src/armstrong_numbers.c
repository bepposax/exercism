#include "armstrong_numbers.h"
#include <math.h>

static unsigned int number_of_digits(int n)
{
    unsigned int count = 0;

    while (n > 0)
    {
        n /= 10;
        count++;
    }
    return count;
}

int is_armstrong_number(int n)
{
    const unsigned int digits = number_of_digits(n);
    unsigned int sum = 0;
    unsigned int number = n;

    for (unsigned int i = 0; i < digits; i++)
    {
        sum += pow(number % 10, digits);
        number /= 10;
    }

    return (int)sum == n;
}