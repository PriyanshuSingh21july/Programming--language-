

<?php

$multidArry=array(
               array(1,2,3,47),
               array(11,2,3,49),
               array(1,24,36,4),
               array(1,2,3,48)
);
/*echo var_dump($multidArry); */

for($i=0; $i<count($multidArry); $i++)
{
               for($j=0; $j<count($multidArry[$i]); $j++)
               {
                              echo $multidArry[$i][$j];
                              echo " ";
               }
               echo "<br>";
}

?>