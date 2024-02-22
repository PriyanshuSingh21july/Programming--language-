<?php
function processmark($markArr)
{
               $sum=0;
               foreach($markArr as $value)
               {
                              $sum+=$value;
               }
               return $value;
}


$priyanshu=[60,70,78,79,89];
$summark= processmark($priyanshu);
echo "Average of total mark $summark ";



?>