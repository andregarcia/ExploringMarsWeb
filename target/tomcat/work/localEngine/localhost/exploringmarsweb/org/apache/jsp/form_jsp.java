package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html>\n");
      out.write("\n");
      out.write("\t<head>\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("    \t\t\t$(\"#sendButton\").click(function(){\n");
      out.write("    \t\t\t\tvar inputLines = $(\"textarea#inputTextarea\").val();\n");
      out.write("        \t\t\t$.post(\"explore/mars?form\",\n");
      out.write("        \t\t\t\t{input: inputLines},\n");
      out.write("        \t\t\t\tfunction(data,status){\n");
      out.write("        \t\t\t\t\t$(\"textarea#outputTextarea\").val(data);\n");
      out.write("        \t\t\t\t}).fail(function(data){\n");
      out.write("        \t\t\t\t\talert(data.responseText);\n");
      out.write("        \t\t\t\t});\n");
      out.write("    \t\t\t});\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t$(\"#clearButton\").click(function(){\n");
      out.write("    \t\t\t\t$(\"textarea#outputTextarea\").val(\"\");\n");
      out.write("    \t\t\t});\n");
      out.write("    \t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<!-- title -->\n");
      out.write("\t\t<div style=\"width:600px; margin-left:auto; margin-right:auto; margin-top:50px; text-align:center\">\n");
      out.write("\t\t\t<h1>Welcome to Mars Explorer!</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- labels div -->\n");
      out.write("\t\t<div style=\"width:600px;margin:0px auto; margin-top:50px\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px; text-align:center\">\n");
      out.write("\t\t\t\tInput\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px; text-align:center\">\n");
      out.write("\t\t\t\tOutput\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- textarea divs -->\n");
      out.write("\t\t<div style=\"width:600px;margin:0px auto; margin-top:50px\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px\">\n");
      out.write("\t\t\t\t<textarea id=\"inputTextarea\" cols=\"30\" rows=\"20\" style=\"margin-left:20px\"></textarea>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px\">\n");
      out.write("\t\t\t\t<textarea id=\"outputTextarea\" cols=\"30\" rows=\"20\" style=\"margin-left:20px\"></textarea>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- buttons div -->\n");
      out.write("\t\t<div style=\"width:600px;margin:0px auto; margin-top:50px\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px; text-align:center\">\n");
      out.write("\t\t\t\t<input type=\"button\" \n");
      out.write("\t\t\t\t\t\tid=\"sendButton\"\n");
      out.write("\t\t\t\t\t\tvalue=\"Send probes!\" \n");
      out.write("\t\t\t\t\t\tstyle=\"margin:auto\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div style=\"display:inline;float:left;width:300px; text-align:center\">\n");
      out.write("\t\t\t\t<input type=\"button\" \n");
      out.write("\t\t\t\t\t\tid=\"clearButton\"\n");
      out.write("\t\t\t\t\t\tvalue=\"Destroy probes!\" \n");
      out.write("\t\t\t\t\t\tstyle=\"margin:auto\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
