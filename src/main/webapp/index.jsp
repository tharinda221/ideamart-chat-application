<%@ page import="com.ideamart.sample.usermgt.UserDAO" %>
<html>
<head>
    <style type="text/css">
        td, th {
            width: 4rem;
            height: 2rem;
            border: 1px solid #ccc;
            text-align: center;
        }

        th {
            background: lightblue;
            border-color: white;
        }

        body {
            padding: 1rem;
        }
    </style>
</head>
<body>
<h2>ECHAT</h2><br>
<%
    UserDAO userDAO = new UserDAO();
    int total = userDAO.getTotalUsers();
    int pending = userDAO.getPendingUsers();
    int active = total - pending;
    int [] array = userDAO.getTotalSubscribers();
    int reg = array[0];
    int unReg = array[1];

%>
<table>
    <tr>
        <th>Application Name</th>
        <th>Total Users</th>
        <th>Active Users</th>
        <th>Pending Users</th>
        <th>Subscribed Users</th>
        <th>UnSubscribed Users</th>

    </tr>
    <tr>
        <td>echat</td>
        <td><%=total%>
        <td><%=active%>
        <td><%=pending%>
        <td><%=reg%></td>
        <td><%=unReg%></td>
    </tr>

</table>
</body>
</html>
