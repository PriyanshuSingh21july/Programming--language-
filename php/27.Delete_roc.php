
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
    echo "Connection is successful<br>";
}





$sql="DELETE FROM   `phpinsert`  WHERE Name='Priya' ";  /* data babse name phphinsert*/
$result=mysqli_query($conn,$sql);






?>





















<!--27.Delete_roc