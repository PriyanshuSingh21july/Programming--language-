<?php

$servername = "localhost";
$username = "username";
$password = "password";
$dbname="vivek";

$conn =mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}



$id= $_POST['id'];
$fname= $_POST['fname'];
$lname= $_POST['lname'];
$email= $_POST['email'];






$sql="INSERT INTO `crud`(`Id`, `Fname`, `Lname`, `Email`) VALUES ('id','fname','lname','email')";
$results=mysqli_query($con,$sql);



if($results)
{
               echo "data sumbitted";
}
else{
               echo "query fail ....!";
}





?>