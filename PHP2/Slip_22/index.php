<?php

$arr = array(1, 2, 5);
while (true) {
    echo " 1. Insert Element \n 2. Delate element \n 3.Display\n ";
    $op = readline("\nEnter Op ");
    switch ($op) {
        case 1: {
                $ele = readline(" Enter Element to push in Queue");
                array_push($arr, $ele);
                break;
            }
        case 2: {
                array_shift($arr);
                break;
            }
        case 3: {
                print_r($arr);
                break;
            }
    }
}
?>