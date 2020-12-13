<%-- 
    Document   : course
    Created on : 11 déc. 2020, 15:39:58
    Author     : moham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${courseSession.course.code} - ${courseSession.course.title}</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/styles.min.css">
        <link rel="stylesheet" href="assets/css/course.css">
    </head>
    <body>
        <nav class="navbar navbar-light navbar-expand bg-light navigation-clean">
            <div class="container"><a class="navbar-brand" href="/">LO54</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"></button>

            </div>
        </nav>
        <section class="bloc-course-detail">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="card" style="height: 100%;">
                            <div class="card-body" style="height: 280px;">
                                <h3 class="card-title">${courseSession.course.title}</h3>
                                <h5 class="text-muted card-subtitle mb-2">${courseSession.location.city}</h5>
                                <h6>${numberRegistered} inscrits sur ${courseSession.maxParticipant} places totales</h6>
                                <h6 class="text-muted card-subtitle mb-2">${courseSession.startDate} - ${courseSession.endDate}</h6>
                                <p class="card-text"><br />Nullam id dolor id nibh ultricies vehicula ut id elit. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus.<br /></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
       <form method="post" action="/inscriptionClient" style="width: 100%;">
            <h2 class="text-center">S&#39;inscrire au cours</h2>
            <div class="form-row">
                <div class="col">
                    <div class="form-group"><input type="text" class="form-control" placeholder="Nom" name="lastname" /></div>
                    <div class="form-group"><input type="text" class="form-control" placeholder="Prénom" name="firstname" /></div>
                    <div class="form-group"><input type="email" class="form-control" name="email" placeholder="Email" /></div>
                </div>
                <div class="col">
                    <div class="form-group"><input type="text" class="form-control" placeholder="Adresse" name="address" /></div>
                    <div class="form-group"><input type="tel" class="form-control" name="phone" placeholder="Mobile" /></div>
                    <div class="form-group"><input type="text" value="${courseSession.id}" name="courseSession" placeholder="Mobile" />Cours Session n°${courseSession.id}</div>
                </div>
            </div>
            <div class="form-group"><button class="btn btn-primary btn-block" type="submit">S&#39;inscrire</button></div>
        </form>
                </div>
                </div>
            </div>
            <div class="form-container"></div>
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
