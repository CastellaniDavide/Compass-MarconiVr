<style>
body {
  color: white;
  background-color: black;
}
h1 {
    font-size: 57px;
}
h3 {
    font-size: 40px;
}
</style>
<?php 

//echo $_GET['year'] . "<br>";  // To get a parameter for example 'year'

// Take xml
$xml=simplexml_load_file("http://www.castellanidavide.it/Orario/orario-lite.xml") or die("Error: Cannot create object");

// Search my day
foreach($xml->children() as $child)
{
    if($child->year == $_GET['year'] && $child->month == $_GET['month'] && $child->day == $_GET['day'] && $child->class == $_GET['class']){
        if($_GET['hour'] == $child->hour)
        {
            echo "<h1>";
		}
        else {
        	echo "<h3>";
        }

        echo $child->hour . "<br>" . $child->classroom . "<br>" . $child->schoolmates . "<br>" . $child->proff . "<br>" . "<br>";
        if($_GET['hour'] == $child->hour)
        {
            echo "</h1>";
		}
        else {
        	echo "</h3>";
        }
    }
}
?> 