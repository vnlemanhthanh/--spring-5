<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      type="text/css"
      href="${pageContext.request.contextPath}/resources/css/style.css"
    />
    <link
      type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
    />
    <title>Sace Customer</title>
  </head>
  <body>
    <div id="wrapper">
      <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
      </div>
    </div>
    <div id="container">
      <h3>Save Customer</h3>
      <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <!-- need to associate this data with customer id -->
        <!-- <form:hidden path="id"></form:hidden> -->
        <table>
          <tbody>
            <tr>
              <td><form:hidden path="id"></form:hidden></td>
            </tr>
            <tr>
              <td><label for="firstName">First Name:</label></td>
              <td>
                <form:input path="firstName" id="firstName"></form:input>
              </td>
            </tr>
            <tr>
              <td><label for="lastName">Last Name:</label></td>
              <td><form:input path="lastName" id="lastName"></form:input></td>
            </tr>
            <tr>
              <td><label for="email">Email:</label></td>
              <td><form:input path="email" id="email"></form:input></td>
            </tr>
            <tr>
              <td><label></label></td>
              <td><input type="submit" value="Save" class="save"></td>
            </tr>
          </tbody>
        </table>
      </form:form>
      <div style="clear: both;">
      <p>
        <a href="${pageContext.request.contextPath}/customer/list">
          Back to List
        </a>
      </p></div>
    </div>
  </body>
</html>
