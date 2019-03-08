<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=button] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=button]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function(){
	$("button").click(function(){
		send();	
	});
});

function send(){
	$("form").attr({
		"method":"post",
		"action":"/board/write"
	});
	
	$("form").submit();
}
</script>
</head>
<body>

<h3>등록폼</h3>

<div class="container">
  <form>
    <input type="text" name="writer" placeholder="Your name..">
    <input type="text" name="title" placeholder="title...">
    <textarea name="content" placeholder="Write something.." style="height:200px"></textarea>
  </form>
   <button>등록</button>
</div>

</body>
</html>
