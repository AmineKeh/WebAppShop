<!DOCTYPE html>
<html>
  <head>
      <meta charset="utf-8" />
      <title> {pagename} - Book Market </title>
      <link href="<%=config.getServletContext().getContextPath()%>/resources/styles.css" type="text/css" rel="stylesheet" />
  </head>

  <body>
    <header>
      <section class="headerLeft">
        <img src="<%=config.getServletContext().getContextPath()%>/resources/open135.png" />
      </section>
      <section class="headerRight">
        <h1>Book Market</h1>
        <p class="slogan">"Reading is a Powa"</p>
        <nav>
          <ul>
            <li><a href="<%=config.getServletContext().getContextPath()%>/" >Home</a></li>
            <li><a href="<%=config.getServletContext().getContextPath()%>/books" >Books</a></li>
            <li><a href="<%=config.getServletContext().getContextPath()%>/cart" >Cart</a></li>
          </ul>
        </nav>
      </section>
      <div class="clear"></div>
    </header>