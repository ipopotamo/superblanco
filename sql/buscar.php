<!DOCTYPE html>
<html>
<head>
		
		<meta charset="utf-8">

<br><br>

</head>
<body>

<?php
    $var = include("conexion.php");

 if (trim('registre')) {
    $id = $_POST['id'];
	$consulta = "SELECT * FROM `user` WHERE id = '$id' ";
	$resultado = mysqli_query($mysql,$consulta);
 }



     ?>
		<table class = "tabla2" border="5px solid red">
			 <thead>

                 <th class = "col">Nombre</th>
				 <th class = "col">Email</th>
				 <th class = "col">Fecha inicio</th>
                 <th class = "col">Fecha upgrade</th>


			 </thead>
				 <tbody>
				 <?php while($row = $resultado->fetch_assoc()){    ?>
					 <tr>
						 <td class = "fil"><?php  echo $row['usuario'] ?></td>
						 <td class = "fil"><?php  echo $row['mail'] ?></td>
                         <td class = "fil"><?php  echo $row['created_at'] ?></td>
                         <td class = "fil"><?php  echo $row['updated_at'] ?></td>
				 <?php }?>
				 </tbody>
		 </table>


         </body>
</html>         