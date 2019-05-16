<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>CheapifyIT</title>

    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- ANIMATE STYLE  -->
    <link href="assets/css/animate.css" rel="stylesheet" />
    <!-- FLEXSLIDER STYLE  -->
    <link href="assets/css/flexslider.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONTS  -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css' />
     <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />
    <style type="text/css">
.float_right { float: right; }</style>
<style>
       #map {
        height: 400px;
        width: 100%;
       }
    </style>
</head>
<body>

 
    <section class="menu-section">
        <div class="container">
            <div class="row ">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                        <a class="navbar-brand" href="index.jsp">

                    <img src="assets/img/logo.png" />
                </a>
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            
                           
                           <li><a href="customer.jsp">HOME</a></li>
                             <li><a href="notification.jsp" >NOTIFICATIONS</a></li>
                             <li><a href="wishlist.jsp">WISHLIST</a></li>
                            <li><a href="history.jsp">HISTORY</a></li>
                            <li><a href="index.jsp">SIGN OUT</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
     <!-- MENU SECTION END-->
    
    <div class="below-slideshow">
         <div class="container">
        <div class="row">
            
             
            <!--content-->

        </div>

    </div>
    </div>
    <!-- BELOW SLIDESHOW SECTION END-->
  
     
            
 

   
    <div class="just-sec">
        

    
    </div>         
     <!--JUST SECTION END-->
     <div class="container " >
             <div class="row">
            <div class="col-lg-10 col-md-10 col-sm-10 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-12 set-div">
                <div class="just-txt-div text-center">
              
                     <div class="just-sec">
            <!--<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">-->
               <!-- <div class="just-txt-div">-->
       <div class="form-group">
                               <h1 style="text-align: center"><strong>LOGIX DIGITAL SYSTEM</strong> </h1>
                                  <h3 style="text-align: center">Putalisadak, Kathmandu, Nepal</h3>
                                  <p>website: http://www.lds.com.np/</p>
                                  <p>contact: +977-1-4424327/01-4439793</p>
                              <!-- </div>-->
            
     </div> 
         
                </div>
                <div id="map"></div>
                </div> 
            </div>
         </div>
     
  
   
   <div class="footer-sec">
         <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

              
									<h3> <strong>ABOUT CHEAPIFY IT</strong> </h3>
									<p style="padding-right:50px;" >
										Cheapify IT is a startup by girls in technology to help people make the right decisions while buying technology and gadgets.
									</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 social-div">
               

              
										<h3> <strong>SOCIAL PRESENCE</strong> </h3>
                We love to be social,Catch Us On
                <a href="#" ><h4>FACEBOOK </h4></a>
                   <a href="#" ><h4>TWITTER </h4></a>
                 <a href="#" ><h4>LINKEDIN </h4></a>
									
                    
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
            <h3> <strong>ADDRESS</strong> </h3>
                Reach Us Below:
                <br />
                <h4>Shantinagar,Kathmandu</h4>
                 <h4>Nepal,</h4>
                 <h4>Call: 4455677</h4>
            </div>
        </div>
 <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <hr />
                <div style="text-align:right;padding:5px;">
                    &copy;2017 cheapifyit.com | 
                </div>
            </div>
    </div>
    </div>
       </div>
          



    <script>
      function initMap() {
        var uluru = {lat: 27.702502, lng: 85.319978};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBkctOPNCahsfBFpCCJTC6bQmCE8dVPPAk&callback=initMap">
    </script>
     <!--FOOTER SECTION END-->
      <!-- WE PUT SCRIPTS AT THE END TO LOAD PAGE FASTER-->
     <!--CORE SCRIPTS PLUGIN-->
    <script src="assets/js/jquery-1.11.1.min.js"></script>
     <!--BOOTSTRAP SCRIPTS PLUGIN-->
<script src="assets/js/bootstrap.js"></script>
     <!--WOW SCRIPTS PLUGIN-->
    <script src="assets/js/wow.js"></script>
     <!--FLEXSLIDER SCRIPTS PLUGIN-->
    <script src="assets/js/jquery.flexslider.js"></script>
     <!--CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
</body>

</html>
