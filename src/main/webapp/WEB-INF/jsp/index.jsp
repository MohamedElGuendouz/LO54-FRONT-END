<%-- 
    Document   : Index
    Created on : 11 déc. 2020, 14:18:41
    Author     : moham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/styles.min.css">
        <title>Home Page</title>
        <style>
            .background-header {
                background-image: url("img/site-belfort.jpg");
                background-repeat: no-repeat;
                background-position: center;
            }
        </style>
    </head>
    <nav class="navbar navbar-light navbar-expand bg-light navigation-clean">
        <div class="container"><a class="navbar-brand" href="/">LO54</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"></button>
            <div class="collapse navbar-collapse" id="navcol-1"><a class="btn btn-primary ml-auto" role="button" href="login.html">Connexion</a></div>
        </div>
    </nav>
    <header class="masthead text-white text-center background-header">
        <div class="overlay">
        </div>
        <div class="container justify-content-center align-items-center align-content-center align-self-center" style="width: 1178px;">
            <div class="col-xl-12 mx-auto">
                <h1 class="mb-5">Chercher une formation</h1>
            </div>
            <div class="col-md-12 col-lg-12 col-xl-12 mx-auto">
                <form>
                    <div class="form-row d-flex justify-content-xl-center">
                        <div class="col-auto col-md-2 mb-2 mb-md-0"><input type="text" class="form-control" style="height: 95%;font-size: 12px;" placeholder="Entrer un titre..." value="" name="text"/></div>
                        <div class="col-auto col-md-2"><input class="form-control" type="date" style="height: 95%;font-size: 12px;" value="" placeholder="Rechercher par date (début +- 2 jours)" name="date"/></div>
                        <div class="col-auto col-md-2"><select class="form-control" style="height: 95%;font-size: 12px;" value="" name="location">
                            <option value="" selected>Localisation</option>
                            <c:forEach  items="${locations}" var ="location">
                                <option value="${location.city}">${location.city}</option>
                            </c:forEach>
                            </select></div>
                        <div class="col-auto col-md-1"><button class="btn btn-primary btn-block btn-lg" type="submit" style="height: 95%;font-size: 12px;text-align: center;">Go !</button></div>
                    </div>
                </form>
            </div>
        </div>
    </header>
    <main>
        <hr/>
        <div class="container">
            <div class="card-group">
                <c:forEach  items="${courseSessions}" var ="courseSession">
                     <div class="card"><img class="card-img-top w-100 d-block" />
                        <div class="card-body">
                            <h4 class="card-title">${courseSession.course.title}</h4>
                            <p class="card-text">du ${courseSession.startDate} au ${courseSession.endDate}</p>
                            <button class="btn btn-primary" type="link" role="link" href="/courseDetails?id=${courseSession.id}">
                                <a class="btn btn-primary" role="button" href="/course?id=${courseSession.id}">Détails</a>
                            </button>
                        </div>
                    </div>
                    <option value="${location.id}">${location.city}</option>
                </c:forEach>
            </div>
        </div>
    </main>
    <hr/>
    <footer class="footer bg-light">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 my-auto h-100 text-center text-lg-left">
                    <ul class="list-inline mb-2">
                        <li class="list-inline-item"><a href="#">About</a></li>
                        <li class="list-inline-item"><span>⋅</span></li>
                        <li class="list-inline-item"><a href="#">Contact</a></li>
                        <li class="list-inline-item"><span>⋅</span></li>
                        <li class="list-inline-item"><a href="#">Terms of  Use</a></li>
                        <li class="list-inline-item"><span>⋅</span></li>
                        <li class="list-inline-item"><a href="#">Privacy Policy</a></li>
                    </ul>
                </div>
                <div class="col-lg-6 my-auto h-100 text-center text-lg-right">
                    <ul class="list-inline mb-0">
                        <li class="list-inline-item"><a href="#"><i class="fa fa-facebook fa-2x fa-fw"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-twitter fa-2x fa-fw"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-instagram fa-2x fa-fw"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    </body>
</html>
