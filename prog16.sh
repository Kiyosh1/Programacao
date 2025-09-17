#!/bin/bash

read num1
read num2

if [ $num2 -gt $num1 ]; then

    temp=$num1
    num1=$num2
    num2=$temp
    
fi

while [ $num1 -ge $num2 ]
do
    echo $num1
    num1=$(( num1 - 1))
done

exit 0
