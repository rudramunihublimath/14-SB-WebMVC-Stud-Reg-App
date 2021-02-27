<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Student Registration<h1>
    <font color="blue">${msg}</font>
    <form:form action="studentReg" method="POST" modelAttribute="student">
        <table>
            <tr>
                <td>Student Name</td>
                <td><form:input path="studentName"/></td>
            </tr>
            <tr>
                <td>Student Email</td>
                <td><form:input path="studentEmail"/></td>
            </tr>
             <tr>
                 <td>Gender</td>
                 <td><form:radiobuttons path="gender" items="${genders}" /></td>
             </tr>
            <tr>
                  <td>Select course</td>
                  <td><form:select path="course">
                        <form:options items="${courses}" />
                      </form:select>
                   </td>
            </tr>
            <tr>
                  <td>Timings</td>
                  <td><form:checkboxes path="timings" items="${timings}" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="SUBMIT" value="Register" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>