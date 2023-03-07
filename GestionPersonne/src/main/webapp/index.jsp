<%--
  Created by IntelliJ IDEA.
  User: khali
  Date: 6/4/2022
  Time: 1:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>inscription</title>
    <style>
        .container{
            margin: auto;
            display: inline-block;
            text-align: center;

        }
    </style>
</head>
<body>
    <center>
    <div class="container">
        <form action="/ControlPersonne" method="post">
            <fieldset>
                <legend> INSCRIPTION </legend>
                <label for="prenom">Prénom : </label>
                <input type="text" name="prenom" id="prenom"></br></br>
                <label for="nom">Nom : </label>
                <input type="text" name="nom" id="nom"></br></br>
                <label for="mail">Email : </label>
                <input type="email" name="mail" id="mail"></br></br>
                <label >Sexe : </label>
                <input type="radio" id="homme" name="sex" value="homme">
                  <label for="homme">H</label>
                  <input type="radio" id="femme" name="sex" value="Femme">
                  <label for="femme">F</label><br></br>
                <label for="psw">Prénom : </label>
                <input type="Password" name="mdp" id="psw"></br></br>
                <label for="psd">Prénom : </label>
                <input type="Password" name="mdpc" id="psd"></br></br>
                <label for="pays">Pays</label>
                <select name="pays" id="pays">
                    <option value="france">France</option>
                    <option value="espagne">Espagne</option>
                    <option value="italie">Italie</option>
                    <option value="royaume-uni">Morroco</option>
                    <option value="canada">Canada</option>
                    <option value="etats-unis">États-Unis</option>
                    <option value="chine">Chine</option>
                    <option value="japon">Japon</option>
                </select></br></br>
                <label >Language Prefere : </label>
                <input type="checkbox" id="c++" name="language" value="C++" >
                <label for="c++">C++</label>
                <input type="checkbox" id="java" name="language" value="JAVA">
                <label for="java"> JAVA</label>
                <input type="checkbox" id="php" name="language" value="php">
                <label for="php"> PHP</label><br></br>
                <input type="submit" name="valider" value="Valider">
                <input type="reset" name="annuler" value="Annuler">
            </fieldset>
        </form>
    </div>
    </center>
    <c: />
</body>
</html>
