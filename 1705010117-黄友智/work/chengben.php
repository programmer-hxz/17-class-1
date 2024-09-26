<?php
	header("content-type:text/html;charset=utf-8"); 
?>

<?php
	$year = $_POST["year"];
	$number = $_POST["number"];
	$wages = $_POST["wages"];
	// echo $year;
	$a = floor(4080* exp(0.28*($year-1960)));
	$b = $a/(20*$number);
	$c = $b*$wages;
	echo "装满程序所需要的成本为：";
	echo $c;
	echo "美元";
	echo "<br/>";
	echo "<a href=\"work33.5.html\">返回</a>";
?>