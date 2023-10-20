<?php

$n1 = 5;
$n2 = 5;

//a . find mod 
function findMod($n1, $n2)
{
    echo $n1 % $n2, " \n ";
    echo $n2 % $n1, " \n ";
}
findMod($n1, $n2);

//b. find power 
function findPow($n1, $n2)
{
    echo $n1 ** $n2, " \n ";
}
findPow($n1, $n2);

//c. find the sum of n numbers 
function NSum($n1)
{
    echo ($n1 * ($n1 + 1)) / 2;
}
NSum($n1);

//d. find factorial of secound number 
function fact($n2, $total = 1)
{
    for ($i = 2; $i <= $n2; $i++) {
        $total = $total * $i;
    }
    echo "\n Fact = ", $total;
}
fact($n2);
