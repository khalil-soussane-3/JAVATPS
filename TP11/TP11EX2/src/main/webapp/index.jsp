<%--
  Created by IntelliJ IDEA.
  User: khali
  Date: 6/1/2022
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulaire</title>
    <style>
        table{
            position: center;
            width: 30%;
            margin: 0 auto;
            background-color: #f1f1f1;
        }

    </style>
</head>
<body>
<h1 Style="position: center">Formulaire</h1>
<form action="hello-servlet" method="post">
    <table border = "1" width = "100%">
        <tr>
            <td>Cne : *</td>
            <td><input type="text" name="cne" required ></td>
        </tr>
        <tr>
            <td>Nom : *</td>
            <td><input type="text" name="nom" required ></td>
        </tr>
        <tr>
            <td>Prenom : *</td>
            <td><input type="text" name="prenom" required ></td>
        </tr>
        <tr>
            <td>Ville : </td>
            <td><input type="text" name="ville" ></td>
        </tr>
        <tr>
            <td>Date de naissance : *</td>
            <td><input type="date" name="dtn" required ></td>
        </tr>
        <tr>
            <td>bourse (DH) : </td>
            <td><input type="text" name="bourse" ></td>
        </tr>
        <tr>
            <td><input type="submit"  value="valider"></td>
            <td><input type="reset" value="Supprimer" ></td>
        </tr>
    </table>
</form>
</body>
</html>
