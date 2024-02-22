<?php

// Connecting to the Database
$servername = "localhost";
$username = "root";
$password = "";
$database = "priyanshus";

// Create a connection
$conn = mysqli_connect($servername, $username, $password, $database);
// Die if connection was not successful
if (!$conn){
    die("Sorry we failed to connect: ". mysqli_connect_error());
}
else{
    echo "Connection was successful<br>";
}


$sql="INSERT INTO `phpinsert` (`ID`, `Name`, `Age`, `Gender`) VALUES ('3', 'Vivek', '19', 'Male')";
$results=mysqli_query($conn,$sql);




if($results)
{
               echo "data sumbitted";
}
else{
               echo "query fail ....!";
               mysqli_error($conn);
}
?>



<!--24.Insert.php