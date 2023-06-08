#!/usr/bin/env bash

calc () {
    declare -i d=$(digits $1) && echo "digits = $d"
    n=$1 && echo "n = $n"
    declare -i res=0
    for (( i=0; i<d; ++i )); do
		echo "i = $i"
        m=$(($n % 10)) && echo "m = $m" 
        pow=$(($m ** $d)) && echo "pow = $pow"
        res+=pow && echo "res = $res"
        ((n /= 10))	&& echo "n = $n"
    done
    echo $res & echo "final result = $res"
}

digits () {
    d=3
    a=$1
    while (( $a > 999 )); do
        ((a /= 10))
        ((++d))
    done
    echo $d
}

main () {
    (($1 < 10)) && echo true && exit 0
    (($1 < 100)) && echo false && exit 0
    calc $1
}

main "$@"
