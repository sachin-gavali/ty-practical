<?php
$arr = array(
    'a' => 10,
    'b' => 20,
    'c' => 30,
    'd' => 40
);
while (true) {
    echo " 1 : Reverse the order \n 2 : Traverse elements  \n 3 : Individual variable \n 4:Display Elements \n ";
    $op = readline(" Enter Op : \n ");
    switch ($op) {
        case 1: {
            print_r(array_reverse($arr));
                break;
            }
        case 2: {
            shuffle($arr);
            print_r($arr);
                break;
            }
        case 3: {
            extract($arr);
            echo " After Individual variables \n ";
            echo $a , " \n ";
            echo $b , " \n ";
            echo $c , " \n ";
            echo $d , " \n ";
           
                break;
            }
        case 4: {
            print_r($arr);
                break;
            }

            default:{
                echo "Invalid Op";
                break;
            }

    }
}
