 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
 
 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>-->
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="/resources/js/jquery-2.1.3.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap-switch.js" />"></script>
    <script src="<c:url value="/resources/js/custom.js" />"></script>
    <script src="<c:url value="/resources/js/star-rating.js" />"></script>
    <script src="<c:url value="/resources/js/rating.js" />"></script>
    <script src="<c:url value="/resources/js/photo.js" />"></script>
    
    <!-- aucomplete  -->
    <script src="<c:url value="/resources/core/jquery.1.10.2.min.js" />"></script>
	<script src="<c:url value="/resources/core/jquery.autocomplete.min.js" />"></script>
	
	    <!-- *******************pour la recherche***************** -->
     <script src="<c:url value="/resources/js/liquidmetal.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.flexselect.js" />"></script>   
    <script src="<c:url value="/resources/js/messagerie.js" />"></script>
	
    
    <script>
  $(document).ready(function() {
 
	$('#w-input-search').autocomplete({
		serviceUrl: '${pageContext.request.contextPath}/getTags',
		paramName: "tagName",
		delimiter: ",",
	   transformResult: function(response) {
 
		return {      	
		  //must convert json to javascript object before process
		  suggestions: $.map($.parseJSON(response), function(item) {
 
		      return { value: item.tagName, data: item.id };
		   })
 
		 };
 
            }
 
	 });
 
  });
  </script>