<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/ckeditor/ckeditor.js"></script>
	<script>
		$(function () {
			CKEDITOR.replace('content', {
				filebrowserUploadUrl: "${pageContext.request.contextPath}/fileUpload"
			})
		});
	</script>
</head>

<body>
	<form action="bbsUpload.do" method="post">
		<input type="text" name="title" id="title">
		<textarea name="content" id="content" cols="30" rows="10"></textarea>
		<input type="text" name="writer" id="writer">
	</form>
</body>

</html>