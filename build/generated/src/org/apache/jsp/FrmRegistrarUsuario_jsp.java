package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmRegistrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>SisServicios</title>\n");
      out.write("    <a href=\"img/logo.ico\"></a>\n");
      out.write("    <link rel=\"icon\" href=\"img/logo.ico\" />\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- animate CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <!-- owl carousel CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <!-- themify CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("    <!-- flaticon CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <!-- font awesome CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("    <!-- swiper CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slick.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.css\">\n");
      out.write("    <!-- style CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--::header part start::-->\n");
      out.write("    <header class=\"main_menu\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                        <a class=\"\" href=\"FrmPrincipal.jsp\"> <img src=\"img/logo.jpg\" alt=\"logo\"> </a>\n");
      out.write("\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                                data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse main-menu-item justify-content-end\"\n");
      out.write("                             id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item active\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"FrmPrincipal.jsp\">Inicio</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"\">Servicios</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"login/index.html\">salir</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <!-- Header part end-->\n");
      out.write("\n");
      out.write("    <!-- breadcrumb start-->\n");
      out.write("\n");
      out.write("    <!-- breadcrumb start-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- cta_part start -->\n");
      out.write("    <section class=\"cta_part\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("                    <select class=\"form-control\" required>\n");
      out.write("                        <option value=\"\">Seleccione Un Distrito </option>\n");
      out.write("                        <option value=\"1\">Sjl</option>\n");
      out.write("                        <option value=\"2\">Surco</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("                    <h4 align=\"left\">Nombre</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Apellido</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Dni</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Fecha</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Telefono</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Usuario</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                    <h4 align=\"left\">Contraseña</h4>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-sm-10 col-md-10 col-xl-10\">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                    <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                        <input type=\"radio\" id=\"customRadioInline1\" name=\"customRadioInline1\" class=\"custom-control-input\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customRadioInline1\">Cliente</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                        <input type=\"radio\" id=\"customRadioInline2\" name=\"customRadioInline1\" class=\"custom-control-input\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customRadioInline2\">Vendedor</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-sm-3 col-md-3 col-xl-3\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\">Cancelar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!-- cta_part start -->\n");
      out.write("\n");
      out.write("    <!-- service_part start -->\n");
      out.write("\n");
      out.write("    <!-- service_part end -->\n");
      out.write("\n");
      out.write("    <!--::review_part start::-->\n");
      out.write("\n");
      out.write("    <!--::blog_part end::-->\n");
      out.write("\n");
      out.write("    <!-- footer part start-->\n");
      out.write("    <footer class=\"footer-area\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"copyright_part_text text-center\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <p class=\"footer-text m-0\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            SisServicios<script>document.write(new Date().getFullYear());</script>Sistema de Servicios <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Hackaton</a>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <!-- footer part end-->\n");
      out.write("\n");
      out.write("    <!-- jquery plugins here-->\n");
      out.write("    <!-- jquery -->\n");
      out.write("    <script src=\"js/jquery-1.12.1.min.js\"></script>\n");
      out.write("    <!-- popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- easing js -->\n");
      out.write("    <script src=\"js/jquery.magnific-popup.js\"></script>\n");
      out.write("    <!-- swiper js -->\n");
      out.write("    <script src=\"js/swiper.min.js\"></script>\n");
      out.write("    <!-- swiper js -->\n");
      out.write("    <script src=\"js/masonry.pkgd.js\"></script>\n");
      out.write("    <!-- particles js -->\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel2.thumbs.min.js\"></script>\n");
      out.write("    <!-- swiper js -->\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\n");
      out.write("    <!-- custom js -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
