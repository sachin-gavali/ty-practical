<?php

$arr = array(
    "Sagar" => " 31",
    " Vicky" => "41",
    "Leena" => " 39",
    "Ramesh" => "40"
);

// sort by value 
asort($arr);
print_r($arr);
//sort by keys
ksort($arr);
print_r($arr);
// sort by value decending 
arsort($arr);
print_r($arr);
//sort by keys decending 
krsort($arr); 
print_r($arr);
