<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" placeholder="First Name" />
		<br><br>
		Last name: <form:input path="lastName" placeholder="First Name" />
		<br><br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions }"/>			
		</form:select>
		<br><br>
		Favorite Language:
		<form:radiobuttons path="favoriteLanguage"
		 	items="${student.favoriteLanguageOptions}"  />
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"  />
		macOS <form:checkbox path="operatingSystems" value="macOS"  />
		Windows <form:checkbox path="operatingSystems" value="Windows"  />
		<br><br>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>