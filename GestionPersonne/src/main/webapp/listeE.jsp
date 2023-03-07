<%--
  Created by IntelliJ IDEA.
  User: khali
  Date: 6/4/2022
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>ListeE</title>
</head>
<body>
<p style="text-align: center; font-weight: bold">Table de tous les Personnes </p>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                   url = "jdbc:mysql://localhost/base_persoones"
                   user = "root"  password = ""/>

<sql:query dataSource = "${snapshot}" var = "result">
    SELECT * from t_personne;
</sql:query>

<table border = "1" width = "100%">
    <tr>
        <th>nom</th>
        <th>prenom</th>
        <th>email</th>
        <th>sexe</th>
        <th>Pays</th>
        <th>Language</th>
    </tr>

    <c:forEach var = "row" items = "${result.rows}">
        <tr>
            <td> <c:out value = "${row.nom}"/></td>
            <td> <c:out value = "${row.prenom}"/></td>
            <td> <c:out value = "${row.mail}"/></td>
            <td> <c:out value = "${row.sex}"/></td>
            <td> <c:out value = "${row.pays}"/></td>
            <td> <c:out value = "${row.language}"/></td>
        </tr>
    </c:forEach>

</body>
</html>
