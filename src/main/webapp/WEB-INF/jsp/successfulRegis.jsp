<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home - LO54</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">

</head>

<body>
<nav class="navbar navbar-light navbar-expand bg-light navigation-clean">
    <div class="container"><a class="navbar-brand" href="index.html">LO54</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"></button>
        <div class="collapse navbar-collapse" id="navcol-1"><a class="btn btn-primary ml-auto" role="button" href="login.html">Sign In</a></div>
    </div>
</nav>
<section class="features-icons bg-light text-center">
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Pré-Inscription réussie</h4>
				<h6>participant : ${client.firstname} ${client.lastname}</h6>
				<h6>téléphone : ${client.phone}</h6>
				<a href="/">Retour au menu principal</a>
            </div>
        </div>
    </div>
    <hr />
</section>
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
                <p class="text-muted small mb-4 mb-lg-0">© Brand 2020. All Rights Reserved.</p>
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
