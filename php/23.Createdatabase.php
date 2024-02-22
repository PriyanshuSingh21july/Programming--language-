<?php



$servername = "localhost";
$username = "root";
$password = "";


$conn =mysqli_connect($servername, $username, $password);
// Check connection

$sql="CREATE DATABASE priyanshus";
mysqli_query($conn,$sql);


if (!$conn) {
  die("Connection failed: " . $mysqi_connect_error());
}

else{
  echo "Sucessfull";
}


?>

<!-- create database