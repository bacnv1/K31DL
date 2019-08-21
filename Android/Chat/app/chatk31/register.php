<?php
	$user_name = $_POST["user_name"];
	$password = $_POST["password"];
	$name = $_POST["name"];

	include 'connection.php';
	$sql = "INSERT INTO `user`(`user_name`, `password`, `name`) VALUES ('$user_name', '$password', '$name')";
	$query = $conn -> query($sql);
	if ($query) {
		header('HTTP/1.1 200 Register success');
	}else {
		header('HTTP/1.1 401 register fail');
	}
?>