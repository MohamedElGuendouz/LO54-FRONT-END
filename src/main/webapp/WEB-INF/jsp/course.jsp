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
        <jsp:include page="header.jsp" />
        </nav>
        <section class="bloc-course-detail">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="card" style="height: 100%;">
                            <div class="card-body" style="height: 280px;">
                                <h3 class="card-title">${courseSession.course.title}</h3>
                                <hr>
                                <h5 class="text-muted card-subtitle mb-2">${courseSession.location.city}</h5>
                                <hr>
                                <h6>${numberRegistered} inscrits sur ${courseSession.maxParticipant} places totales</h6>
                                <hr>
                                <h6 class="text-muted card-subtitle mb-2">${courseSession.startDate} - ${courseSession.endDate}</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                <form method="post" action="/inscriptionClient" style="width: 100%;">
                     <h2 class="text-center">S&#39;inscrire au cours</h2>
                     <div class="form-row">
                         <div class="col">
                             <div class="form-group"><input type="text" class="form-control" placeholder="Nom" name="lastname" required/></div>
                             <div class="form-group"><input type="text" class="form-control" placeholder="Prénom" name="firstname" required/></div>
                             <div class="form-group"><input type="email" class="form-control" name="email" placeholder="Email" required/></div>
                         </div>
                         <div class="col">
                             <div class="form-group"><input type="text" class="form-control" placeholder="Adresse" name="address" required/></div>
                             <div class="form-group"><input type="tel" class="form-control" name="phone" placeholder="Mobile" required/></div>
                             <div class="form-group"><input type="hidden" value="${courseSession.id}" name="courseSession"/></div>
                         </div>
                    </div>
                    <div class="form-group"><button class="btn btn-primary btn-block" type="submit" ${numberRegistered==courseSession.maxParticipant ? 'disabled="disabled"' : ''}>S&#39;inscrire</button></div>
                </form>
                </div>
                </div>
            </div>
            <div class="form-container"></div>
        </section>
        <hr>
        <jsp:include page="footer.jsp" />
    </body>
</html>
