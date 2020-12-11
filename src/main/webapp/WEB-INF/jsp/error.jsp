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
                <h4 class="card-title">Vous tentez d'accéder à une ressource inconnue</h4>
				<a href="/courseSessions">Retour au menu principal</a>
            </div>
        </div>
    </div>
    <hr />
</section>
<section class="showcase">
    <div class="container-fluid p-0">
        <div class="row no-gutters">
            <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image:url('bg-showcase-1.jpg');"><span></span></div>
            <div class="col-lg-6 my-auto order-lg-1 showcase-text">
                <h2>Fully Responsive Design</h2>
                <p class="lead mb-0">When you use a theme created with Bootstrap, you know that the theme will look great on any device, whether it&#39;s a phone, tablet, or desktop the page will behave responsively!</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 text-white showcase-img" style="background-image:url('bg-showcase-2.jpg');"><span></span></div>
            <div class="col-lg-6 my-auto order-lg-1 showcase-text">
                <h2>Updated For Bootstrap 4</h2>
                <p class="lead mb-0">Newly improved, and full of great utility classes, Bootstrap 4 is leading the way in mobile responsive web development! All of the themes are now using Bootstrap 4!</p>
            </div>
        </div>
        <div class="row no-gutters">
            <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image:url('bg-showcase-3.jpg');"><span></span></div>
            <div class="col-lg-6 my-auto order-lg-1 showcase-text">
                <h2>Easy to Use &amp; Customize</h2>
                <p class="lead mb-0">Landing Page is just HTML and CSS with a splash of SCSS for users who demand some deeper customization options. Out of the box, just add your content and images, and your new landing page will be ready to go!</p>
            </div>
        </div>
    </div>
</section>
<section class="testimonials text-center bg-light">
    <div class="container">
        <h2 class="mb-5">What people are saying...</h2>
        <div class="row">
            <div class="col-lg-4">
                <div class="mx-auto testimonial-item mb-5 mb-lg-0"><img class="rounded-circle img-fluid mb-3" src="testimonials-1.jpg" />
                    <h5>Margaret E.</h5>
                    <p class="font-weight-light mb-0">&quot;This is fantastic! Thanks so much guys!&quot;</p>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="mx-auto testimonial-item mb-5 mb-lg-0"><img class="rounded-circle img-fluid mb-3" src="testimonials-2.jpg" />
                    <h5>Fred S.</h5>
                    <p class="font-weight-light mb-0">&quot;Bootstrap is amazing. I&#39;ve been using it to create lots of super nice landing pages.&quot;</p>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="mx-auto testimonial-item mb-5 mb-lg-0"><img class="rounded-circle img-fluid mb-3" src="testimonials-3.jpg" />
                    <h5>Sarah W.</h5>
                    <p class="font-weight-light mb-0">&quot;Thanks so much for making these free resources available to us!&quot;</p>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="call-to-action text-white text-center" style="background:url('bg-masthead.jpg') no-repeat center center;background-size:cover;">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-xl-9 mx-auto">
                <h2 class="mb-4">Ready to get started? Sign up now!</h2>
            </div>
            <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
                <form>
                    <div class="form-row">
                        <div class="col-12 col-md-9 mb-2 mb-md-0"><input class="form-control form-control-lg" type="email" placeholder="Enter your email..." /></div>
                        <div class="col-12 col-md-3"><button class="btn btn-primary btn-block btn-lg" type="submit">Sign up!</button></div>
                    </div>
                </form>
            </div>
        </div>
    </div>
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
