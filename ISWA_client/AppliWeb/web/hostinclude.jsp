<%--
  Created by IntelliJ IDEA.
  User: orion
  Date: 20/03/2017
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8">
    <title>Swanky Chatbox</title>
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>


    <link rel="stylesheet" href="WEB-INF/css/style.css">


</head>

<body>
<div class='container' ng-cloak ng-app="chatApp">
    <h1>Swanky Chatbox UI With Angular</h1>
    <div class='chatbox' ng-controller="MessageCtrl as chatMessage">
        <div class='chatbox__user-list'>
            <h1>User list</h1>
            <div class='chatbox__user--active'>
                <p>Jack Thomson</p>
            </div>
            <div class='chatbox__user--busy'>
                <p>Angelina Jolie</p>
            </div>
            <div class='chatbox__user--active'>
                <p>George Clooney</p>
            </div>
            <div class='chatbox__user--active'>
                <p>Seth Rogen</p>
            </div>
            <div class='chatbox__user--away'>
                <p>John Lydon</p>
            </div>
        </div>
        <div class="chatbox__messages" ng-repeat="message in messages">
            <div class="chatbox__messages__user-message">
                <div class="chatbox__messages__user-message--ind-message">
                    <p class="name">{{message.Name}}</p>
                    <br/>
                    <p class="message">{{message.Message}}</p>
                </div>
            </div>
        </div>
        <form>
            <input type="text" placeholder="Enter your message">
        </form>
    </div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.14/angular.min.js'></script>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="WEB-INF/js/index.js"></script>

</body>
</html>
