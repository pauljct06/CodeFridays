<?php

$word1 = "please";
$word2 = "asleep";

$letters = array (0,0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0);

$array1 = str_split($word1);
$array2 = str_split($word2);

echo (isItAnagram($array1, $array2, $letters, $letters)) ? "true" : "false";
echo "\n";

function isItAnagram($arr1, $arr2, $alphabet1, $alphabet2) {
    if (sizeof($arr1) != sizeof($arr2)) {
        return false;
    }

    foreach($arr1 as $i) {
        $alphabet1[ord($i) - 97]++;
    }

    foreach($arr2 as $i) {
        $alphabet2[ord($i) - 97]++;
    }

    for($j = 0; $j < sizeof($alphabet1); $j++){
        if($alphabet1[$j] !== $alphabet2[$j]) {
            return false;
        }
    }
    return true;
}

?>