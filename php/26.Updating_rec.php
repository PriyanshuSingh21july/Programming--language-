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



$sql="SELECT * FROM  `phpinsert` WHERE age<=20";  /* data babse name phphinsert*/
$result=mysqli_query($conn,$sql);

/* find number row in table */
$num= mysqli_num_rows($result);
echo $num;



while($row=mysqli_fetch_assoc($result))
{
echo var_dump($row);
echo "<br>";
}



/* where clause*/


?>

<!--26.Updating_rec