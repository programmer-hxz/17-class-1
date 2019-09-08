<?php
	header("content-type:text/html;charset=utf-8"); 
?>

<?php
	$year = $_POST["year"];
	// echo $year;
	$b = 4080* exp(0.28*($year-1960));
	echo $year."年的计算机存储容量的需求估计是：";
	echo floor($b);
	echo "字";
	echo "<br/>";
	echo "<a href=\"work33.5.html\">返回</a>";
?>