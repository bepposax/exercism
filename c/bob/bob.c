#include "bob.h"
#include <ctype.h>
#include <string.h>

static char *answers[] = {
    "Whatever.",
    "Sure.",
    "Whoa, chill out!",
    "Calm down, I know what I'm doing!"};

char *hey_bob(char *greeting)
{
    if (!*greeting || !greeting)
        return "Fine. Be that way!";

    int asking = 0, yelling = 0;
    char *end = greeting + strlen(greeting) - 1;

    while (isspace(*end) && end > greeting)
        end--;
    if (isspace(*end))
        return "Fine. Be that way!";
    if (*end == '?')
        asking = 1;
    while (!isalpha(*greeting) && *greeting)
        greeting++;
    if (isupper(*greeting))
        yelling = 2;

    while (*greeting)
    {
        if (islower(*greeting))
        {
            if (asking)
                return "Sure.";
            if (yelling)
                yelling = 0;
            break;
        }
        greeting++;
    }

    return answers[asking + yelling];
}