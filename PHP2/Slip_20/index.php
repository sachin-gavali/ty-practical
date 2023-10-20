<?php
$arr = array(
    'a' => 45,
    'b' => 72,
    'c' => 35,
    'd' => 40
);
while (true) {
    echo " 1 : Split into Chunks \n 2 : Sort Value without change key   \n 3 : Filter array with Even elements  \n";
    $op = readline(" Enter Op : \n ");
    switch ($op) {
        case 1: {
                $chunks = readline("\n How many Chunks");
                print_r(array_chunk($arr,$chunks));
                break;
            }
        case 2: {
            asort($arr);
            print_r($arr);
                break;
            }
        case 3: {
           
            foreach ($arr as $key => $value) {
                if($value % 2 == 0){
                    echo " Key = ",$key ," value = ", $value , " \n ";
                }
            }
                break;
            }
       

            default:{
                echo "Invalid Op";
                break;
            }

    }
}
