#include "binary_search.h"

const int *binary_search(int value, const int *arr, size_t length)
{
    int min = 0, max = length - 1, mid;

    while (min <= max)
    {
        mid = (min + max) / 2;
        if (arr[mid] == value)
            return arr + mid;
        if (arr[mid] > value)
            max = mid - 1;
        else
            min = mid + 1;
    }
    return NULL;
}