<?php

$server = "localhost";
$username = "root";
$password = "";
$dbname="studen1";
$con=mysqli_connect($server,$username,$password,$dbname);

if(!$con)
{
               echo "not connectd";
}
else{
               echo "connect";
}

$id= $_POST['id'];
$name= $_POST['name'];
$email= $_POST['email'];

$sql="INSERT INTO `vivek`(`id`, `name`, `email`) 
VALUES ('$id','$name','$email')";
$result=mysqli_query($con,$sql);
if($result)
{
               echo "data sumbitted";
}
else{
               echo "query fail ....!";
}



?>