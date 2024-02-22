<?php

// Golbal variable
$a=20;
$b=29;

function variabless()
{
               // Local variable whithin function Scope
             //  $a=23;
             //  echo "$a is a varaible";

             // we want to acess global variable in function
             global $a,$b;

             echo "$a and $b";
}
echo "$a is a varaible";
variabless();




?>