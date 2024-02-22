<?php

$age=18;
if($age>18)
{
               echo "Eligible for voting<br>";
}
elseif($age==18)
{
               echo "Also Eligible for voting<br>";        
}
else{
               echo " Not Eligible for voting<br>";
}     



?>



<?php
$num1=120;
$num2=170;
$num3=180;

if($num1>$num2 && $num1>$num3)
{
               echo "$num1 : Greater number<br>";
}
elseif($num2>$num1 && $num2>$num3)
{
               echo "$num2 : Greater number<br>";
}
else{
               echo "$num3 : is  Greater<br>";
}


?>