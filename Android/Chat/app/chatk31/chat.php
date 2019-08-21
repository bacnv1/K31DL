<?php
	$user_name = $_POST['user_name'];
	$message = $_POST['message'];
	$date = date('H:i d-m-Y');

	include 'connection.php';
	$sql = "INSERT INTO `chat`(`user_name`, `pub_date`, `message`) VALUES ('$user_name', '$date', '$message')";

	$query = $conn -> query($sql);
	if ($query) {
		header('HTTP/1.1 200 Sent message success');
	}else {
		header('HTTP/1.1 401 Sent message fail');
	}
?>