<%-- 
    Document   : index
    Created on : Mar 3, 2017, 6:42:14 AM
    Author     : Roseenah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CheapifyIT</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<!--
Template 2067 Education
http://www.tooplate.com/view/2067-education
-->
<link href="tooplate_style.css" rel="stylesheet" type="text/css" />

<script type="text/JavaScript" src="js/jquery-1.6.3.js"></script> 

<link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />

<script type="text/javascript" src="js/ddsmoothmenu.js">

/***********************************************
* Smooth Navigational Menu- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code
***********************************************/

</script>

<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "tooplate_menu", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})

</script>

<link rel="stylesheet" href="css/slimbox2.css" type="text/css" media="screen" /> 
<script type="text/JavaScript" src="js/slimbox2.js"></script> 

<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />

</head>
<body>

<div id="tooplate_header">
    <a href="index.jsp" class="sitetitle">CheapifyIT.com</a>  
    <div id="tooplate_menu" class="ddsmoothmenu">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="signin.jsp">Sign In</a></li>
            <li><a href="signup.jsp">Sign Up</a>
            
            </li>
            <li><a href="about.jsp">About</a>
                 <ul>
                    <li><a href="services.jsp">Services</a></li>
                    <li><a href="privacy.jsp">Privacy</a></li>
                    <li><a href="techgirls.jsp">TechGirls</a></li>
                                                      
                </ul>
            
           </li>                
            <li class="last"><a href="contact.jsp" class="last">Contact</a></li>
        </ul>
        <br style="clear: left" />
    </div> <!-- end of tooplate_menu -->      
</div> <!-- END of header -->
<div id="tooplate_slider_wrapper">
    
</div>
    <div id="tooplate_main">
    	<div id="home_about">
        <div id="home_about">
        	<h1>About CheapifyIT</h1>
                <p>write something</p></div>
        
        
        
         </div>
       
        
        
        <div class="clear h30"></div>
        <div style="display:none;" class="nav_up" id="nav_up"></div>
    </div>    <!-- END of tooplate_main -->

<div id="tooplate_footer_wrapper">
	<div id="tooplate_footer">
    	<div class="col_4">
        	<h4>Pages</h4>
            <ul class="nobullet bottom_list">
            	<li><a href="index.jsp">Home</a></li>
                <li><a href="about.jsp">About</a></li>
                <li><a href="services.jsp">Services</a></li>
                <li><a href="privacy.jsp">Privacy</a></li>
                <li><a href="contact.jsp">Contact</a></li>
            </ul>
        </div>
        
        <div class="col_4">
        	<h4>Our Partners</h4>
            <ul class="nobullet bottom_list">
                <li><a href="#">US Embassy Nepal</a></li>
                <li><a href="#">MIC Nepal</a></li>
                <li><a href="#">EM Foundation</a></li>
              
            </ul>
        </div>
        
         <div class="col_4">
        	<h4>About</h4>
                <p> Write something about us </p> <a href="#" class="more">More</a>
        </div>
        <div class="col_4 no_margin_right">
        	<h4>Twitter</h4>
                <p>Tweet about us today with </p> <a href="#">#TechGirls</a> and support us ! <a href="#">Follow us on Twitter</a>
        </div>
        <div class="clear"></div>
	</div> <!-- END of tooplate_footer -->
</div> <!-- END of tooplate_footer_wrapper -->

<div id="tooplate_copyright_wrapper">
    <div id="tooplate_copyright">
        Copyright © 2017 Team Snow
        
    </div>
</div>

<script src="js/scroll-startstop.events.jquery.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		var $elem = $('#content');
		
		$('#nav_up').fadeIn('slow');
		
		$(window).bind('scrollstart', function(){
			$('#nav_up,#nav_down').stop().animate({'opacity':'0.2'});
		});
		$(window).bind('scrollstop', function(){
			$('#nav_up,#nav_down').stop().animate({'opacity':'1'});
		});
		
		$('#nav_up').click(
			function (e) {
				$('html, body').animate({scrollTop: '0px'}, 800);
			}
		);
	});
</script>

</body>
</html>