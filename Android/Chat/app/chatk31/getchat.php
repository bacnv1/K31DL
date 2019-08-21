<?php
	include 'connection.php';
	$sql = "SELECT a.user_name, name, message, pub_date, id FROM user a inner join chat b on a.user_name = b.user_name";
	$query = $conn -> query($sql);
	$arr = array();
	while ($row = $query -> fetch_array()) {
		$arr[] = array(
			'id' => $row['id'],
			'user_name' => $row['user_name'],
			'name' => $row['name'],
			'message' => $row['message'],
			'pub_date' => $row['pub_date']
		);
	}
	echo json_encode($arr);
?>