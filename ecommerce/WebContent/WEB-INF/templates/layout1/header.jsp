<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          
        </div>
		<a class="pull-left" href="#"><img src="<c:url value="/resources/images/ekenzy.PNG" />" /></a>
        <div id="navbar" class="navbar-collapse collapse">
			<div class="row martop">
				<div class="col-lg-3">  
				  <div class="input-group">
					  <input type="text"  class="form-control" placeholder="Search for...">
					  <span class="input-group-addon"><span class="glyphicon glyphicon-search" ></span></span>
				  </div><!-- /input-group -->
				</div>
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
						<div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-shopping-cart" ></span></span></div>
					</button>	
				</div>  
				<div class="col-lg-3"> 
				  <div class="input-group">
					  <span class="input-group-addon"><span class="glyphicon glyphicon-align-justify" ></span></span>	
					  <form   action="<%=request.getContextPath()%>/chercherEntreprise" >
					  <input type="text" id="w-input-search" value="" name="name" class="form-control" placeholder="Search for...">					  
					  </form>
					  <span class="input-group-addon"><span class="glyphicon glyphicon-search" ></span></span>
				  </div><!-- /input-group -->
				</div>  
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <span class="input-group-addon"><span class="glyphicon glyphicon-th" ></span></span>
					</button>  
				</div>  
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <span class="input-group-addon"><span class="glyphicon glyphicon-log-in" ></span></span>
					</button>  
				</div>
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <!-- <span class="input-group-addon"><span class="glyphicon glyphicon-log-in" ></span></span>-->
					  <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
					</button>  
				</div>  
				</div>
			</div>	<!-- end row --> 
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
	</div>