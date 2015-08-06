 <%@include file="header.jsp" %>

<h2>Cart</h2>


<%=config.getServletContext().getContextPath()%>
<form action="<%=config.getServletContext().getContextPath()%>/pay" method="post">
	<button>Checkout</button>

</form>

<%@include file="footer.jsp" %>