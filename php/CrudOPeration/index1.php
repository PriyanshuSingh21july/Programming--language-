<?php
/* INSERT INTO `notes` (`Sno`, `Title`, `Description`, `Tstamp`) VALUES ('', 'Learn Php', 'I is a Intresting Language', '2024-02-16 18:24:41.000000'); */

                    // Connecting to the Database
$servername = "localhost";
$username = "root";
$password = "";
$database = "notes";

// Create a connection
$conn = mysqli_connect($servername, $username, $password, $database);
// Die if connection was not successful
if (!$conn){
    die("Sorry we failed to connect: ". mysqli_connect_error());
}
else{
    echo "Connection is successful<br>";
}

if($_SERVER['REQUEST_METHOD']=='post')
{
  *****************************************************************************************************************************************************
}
    ?>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Crud Operation</title>
  </head>

<nav class="navbar navbar-expand-lg bg-body-tertiary navbar-dark bg-dark">


               <div class="container-fluid">
                           
                 <a class="navbar-brand" href="#"> <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/PHP-logo.svg/1200px-PHP-logo.svg.png" alt=""  width="200" height="100"></a>
                 <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                   <span class="navbar-toggler-icon"></span>
                 </button>
                 <div class="collapse navbar-collapse" id="navbarSupportedContent">
                   <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                     <li class="nav-item">
                       <a class="nav-link active" aria-current="page" href="#">Home</a>
                     </li>
                     <li class="nav-item">
                       <a class="nav-link" href="#">About</a>
                     </li>
                     <li class="nav-item dropdown">
                       <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                         Contact Us
                       </a>
                       <ul class="dropdown-menu">
                         <li><a class="dropdown-item" href="#">Action</a></li>
                         <li><a class="dropdown-item" href="#">Another action</a></li>
                         <li><hr class="dropdown-divider"></li>
                         <li><a class="dropdown-item" href="#">Something else here</a></li>
                       </ul>
                     </li>
                     <li class="nav-item">
                       <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                     </li>
                   </ul>
                   <form class="d-flex" role="search">
                     <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                     <button class="btn btn-outline-success" type="submit">Search</button>
                   </form>
                 </div>
               </div>
             </nav>



             <div class="container  my-5" >
               <h2>Add Note</h2>
          <from action="/Crud" method="post">
               <label for="inputPassword5" class="form-label">Note Title</label>
               <input type="password" id="inputPassword5" class="form-control" aria-describedby="passwordHelpBlock" id="title" name="title">
               <div id="passwordHelpBlock" class="form-text">

               </div>
<!--
               <label for="inputPassword5" class="form-label">Note Description</label>
               <input type="password" id="inputPassword5" class="form-control" aria-describedby="passwordHelpBlock" id="desc" name="desc">
               <div id="passwordHelpBlock" class="form-text">
                
               </div>


-->
              

               
               <div class="mb-3">
                              <label for="exampleFormControlTextarea1" class="form-label">Note Description</label>
                              <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"  id="desc" name="desc"></textarea>
               </div>



               <div class="col-10 my-3">
                              <button class="btn btn-primary" type="submit">Add Note</button>
                            </div>
               </from>
               
</div>

<!--***************************-->

<div class="container">
              <?php

     $sql="SELECT * FROM `notes` "; 
     $result=mysqli_query($conn,$sql);
     while($row=mysqli_fetch_assoc($result))
     {
     echo $row['Sno'].   ". Title ".$row['Title']."Desc is".$row['Description']    ;
     echo "<br>";
     }


     
           ?>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Sno.</th>
      <th scope="col">Title</th>
      <th scope="col">Description</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>

  <?php

$sql="SELECT * FROM `notes` "; 
$result=mysqli_query($conn,$sql);
while($row=mysqli_fetch_assoc($result))
{

  echo"<tr>
      <th scope='row'> ". $row['Sno']."</th>
      <td>".$row['Title']."</td>
      <td>".$row['Description']."</td>
      <td>Action</td>
    </tr>";
echo $row['Sno'].   ". Title ".$row['Title']."Desc is".$row['Description']    ;
echo "<br>";
}



      ?>

    
   
  </tbody>
</table>
</div>



   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>