<?php

$salary=array("Sonoo"=>"350000","John"=>"450000","Kartik"=>"200000");  
/*  
echo "Sonoo salary: ".$salary["Sonoo"]."<br/>";  
echo "John salary: ".$salary["John"]."<br/>";  
echo "Kartik salary: ".$salary["Kartik"]."<br/>";  
*/

foreach($salary as $key=>$value)
{
               echo "<br> $key is $value ";
}

?>

<?php

$Priyanshu=array("Name"=>"Priyanshu" , "Rollno"=>"126", "Branch"=>"CSE", "Semester"=>"V", "CGPA"=>"7.12");
foreach($Priyanshu as $key=>$value)
{
               echo "<br> $key is $value";
}


?>