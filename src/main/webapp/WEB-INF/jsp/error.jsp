<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ressource non trouvées</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/styles.min.css">

    </head>

    <body>
        <jsp:include page="header.jsp" />
        <section class="features-icons bg-light text-center">
            <div class="container">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">Ressource non trouvée</h4>
                            <a href="/">Retour au menu principal</a>
                    </div>
                </div>
            </div>
        </section>
        <hr>
        <jsp:include page="footer.jsp" />
    </body>
</html>
