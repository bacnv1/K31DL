<?php
	$user_name = $_POST['user_name'];
	$password = $_POST['password'];

	include 'connection.php';

	$sql = "SELECT * FROM user where user_name = '$user_name' and password = '$password'";
	$query = $conn -> query($sql);
	$row = $query -> fetch_array();
	if ($row) {
		$data = array(
			'user_name' => $row['user_name'],
			'password' => $row['password'],
			'name' => $row['name']
		);
		echo json_encode($data);
	}else {
		header('HTTP/1.1 401 login fail');
	}
?>