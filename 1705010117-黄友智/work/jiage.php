<?php
	header("content-type:text/html;charset=utf-8"); 
?>

<?php
	$year = $_POST["year"];
	@$length = $_POST["length"];
	// echo $year;
	if($length==null)
	{
		$length=1;
	}
	$a = $length*0.003*pow(0.72,$year-1974);
	echo "如果字长为";
	echo $length;
	echo "位，则存储器的价格为：";
	echo $a."美元/字";
	echo "<br/>";
	echo "<a href=\"work33.5.html\">返回</a>";
?>