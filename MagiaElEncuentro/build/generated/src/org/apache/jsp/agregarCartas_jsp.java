package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarCartas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t\t<title>inicio</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"estilos/estilomenu.css\">\n");
      out.write("\t\t<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("\t\t<script src=\"js/main2.js\"></script>\n");
      out.write("\t{}\t<body>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"estilos/estilos.css\">\n");
      out.write("\t\t\t<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\n");
      out.write("\t\t</body>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"contenedor\">\n");
      out.write("\t\t\t<nav class=\".menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Informacion</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Cartas</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Juego</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("            <article>\n");
      out.write("            <hr>\n");
      out.write("            <table align=\"center\">\n");
      out.write("            <form action = \"main.jsp\" method = \"GET\">\n");
      out.write("            Costo: <input type = \"text\" name = \"costo\" />\n");
      out.write("            <br />\n");
      out.write("            Nombre: <input type = \"text\" maxlength=\"50\" name = \"nombre\" />\n");
      out.write("            <br />\n");
      out.write("            Edicion: <input type = \"text\" maxlength=\"20\" name = \"edicion\" />\n");
      out.write("            <br />\n");
      out.write("            Ilustrador: <input type = \"text\" maxlength=\"50\" name = \"ilustrador\" />\n");
      out.write("            <br />\n");
      out.write("            Descripcion: <input type = \"text\" maxlength=\"255\" name = \"descripcion\" />\n");
      out.write("            <br />\n");
      out.write("            <input type = \"submit\" value = \"Submit\" />\n");
      out.write("        </form>\n");
      out.write("        </table>\n");
      out.write("            </article>\n");
      out.write("            </div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
