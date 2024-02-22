<?php

/*
1.Arithmetics
2.Logical
3.Comperision
4.Assignment

*/

$x=10;
$y=20;

// 1.Arithmetics
echo  "Add:".$x+$y;
echo "<br>";
echo  "Sub:".$x-$y;
echo "<br>";
echo  "Mul:".$x*$y;
echo "<br>";
echo  "Div:".$x/$y;
echo "<br>";
echo  "Modulo:".$x%$y;
echo "<br>";
echo  "Exponential:".$x**$y;
echo "<br>";

//4.Assignment
$x +=6;
echo "Assignment:".$x;
echo "<br>";

// 3.Comperision
$x = 100;  
$y = "100";
echo "Comparision".var_dump($x == $y);



?>