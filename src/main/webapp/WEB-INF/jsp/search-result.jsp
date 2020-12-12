<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
    <div class="container"><a class="navbar-brand" href="index.html">LO54</a><button data-toggle="collapse" class="navbar-toggler"></button></div>
</nav>
<div class="align-self-center register-photo">
    <div class="container justify-content-center align-items-center align-content-center align-self-center" style="width: 1178px;">
        <form class="align-self-center" style="width: 1208px;height: 145px;">
            <div class="form-row">
                <div class="col">
                    <h4 style="margin: 2%;text-align: center;">Rechercher</h4>
                </div>
                <div class="col"><input type="email" class="form-control form-control-lg" placeholder="Entrer un mot clé..." style="width: 100%;font-size: 14px;" /></div>
                <div class="col"><input class="form-control" type="date" /></div>
                <div class="col">
					<select class="form-control" style="width: 209px;">
						<c:forEach  items="${locations}" var ="location">
							<option value="${location.id}">${location.city}</option>
						</c:forEach>
					</select>
				</div>
                <div
                    class="col"><button class="btn btn-primary btn-block btn-lg" type="submit" style="width: 148px;margin: 0px;">Chercher  <i class="fa fa-search"></i></button></div>
            </div>
        </form>
    </div>
    <h3 style="margin: 2%;text-align: center;">Listes</h3>
    <hr />
    <div class="container">
        <div class="card-group">
			<c:forEach  items="${courseSessions}" var ="courseSession">
				<div class="card"><img class="card-img-top w-100 d-block" />
					<div class="card-body">
						<h4 class="card-title">${courseSession.course.title}</h4>
						<p class="card-text">du ${courseSession.startDate} au ${courseSession.endDate}</p>
						<button class="btn btn-primary" type="link" role="link" href="/courseDetails?id=${courseSession.id}"><a class="btn btn-primary" role="button" href="/courseDetails?id=${courseSession.id}">Détails</a></button></div>
				</div>
				<option value="${location.id}">${location.city}</option>
			</c:forEach>
        </div>
    </div>
    <div class="form-container">
        <div class="image-holder"></div>
    </div>
</div>
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
