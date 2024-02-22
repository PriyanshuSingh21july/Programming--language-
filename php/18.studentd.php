
<?php

$server = "localhost";
$username = "root";
$password = "";
$dbname="PRIYANSHUDetails";
$con=mysqli_connect($server,$username,$password,$dbname);

if(!$con)
{
               echo "not connectd";
}
else{
               echo "connect";
}


$id= $_POST['id'];
$fname= $_POST['fname'];
$lname= $_POST['lname'];
$email= $_POST['email'];
$dob= $_POST['dob'];
$country= $_POST['country'];
$password= $_POST['password'];
$gender=$_POST['gender'];



$sql="INSERT INTO `crud`(`Id`, `Fname`, `Lname`, `Email`) VALUES ('id','fname','lname','email')";

$sql="INSERT INTO `crud`(`Id`, `Fname`, `Lname`, `Email`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]');
$results=mysqli_query($con,$sql);
if($results)
{
               echo "data sumbitted";
}
else{
               echo "query fail ....!";
}



?>

