<?php

$name="Priyanshu singh";
echo $name;

echo "<br>";

echo  "Length of string :".strlen($name);
echo "<br>";
echo "Total word  :".str_word_count($name);
echo "<br>";
echo "Reverse of string:".strrev($name);
echo "<br>";
echo "Seraching position of string :".strpos($name,"singh");
echo "<br>";
echo "Replace of string :".str_replace("Priyanshu","Vivek ",$name);
echo "<br>";
echo "Repeat name :".str_repeat($name,5);

?>