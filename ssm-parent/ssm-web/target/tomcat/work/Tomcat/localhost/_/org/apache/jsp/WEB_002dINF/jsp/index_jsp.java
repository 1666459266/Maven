/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-09 09:07:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/public.jsp", Long.valueOf(1581238247439L));
    _jspx_dependants.put("/WEB-INF/Common.jsp", Long.valueOf(1581238247031L));
    _jspx_dependants.put("/WEB-INF/Taglib.jsp", Long.valueOf(1581238252365L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<meta charset=\"UTF-8\"><meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/css/layui.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/jquery/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/xadmin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onbeforeunload = function(event) {\r\n");
      out.write("\tvar ws;\r\n");
      out.write("\t ws.onclose = function(){\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tws.close();\r\n");
      out.write("\t}\r</script>");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    window.path = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<title>Backstage Management System</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      out.write("<meta charset=\"UTF-8\"><meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/css/layui.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/jquery/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/xadmin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onbeforeunload = function(event) {\r\n");
      out.write("\tvar ws;\r\n");
      out.write("\t ws.onclose = function(){\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tws.close();\r\n");
      out.write("\t}\r</script>");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    window.path = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<title>Backstage Management System</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"layui-header\">\r\n");
      out.write("\t\t<div class=\"layui-logo\">My Website</div>\r\n");
      out.write("\t\t<!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("\t\t<ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\"><a id=\"main\" href=\"javascript:;\">homepage</a></li>\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\"><a onclick=\"logout()\"\r\n");
      out.write("\t\t\t\thref=\"javascript:;\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layui-side layui-bg-black\">\r\n");
      out.write("\t\t<div class=\"layui-side-scroll\">\r\n");
      out.write("\t\t\t<ul class=\"layui-nav layui-nav-tree\" lay-filter=\"test\">\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a id=\"user\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">User MGT</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a id=\"resource\" href=\"javascript:;\">Resource\r\n");
      out.write("\t\t\t\t\t\tMGT</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item \"><a id=\"pictureCRUD\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">Picture MGT</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a id=\"videoCRUD\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">Video MGT</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a id=\"page\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">Page MGT</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a id=\"about\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">About MGT</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/public.js\"></script>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layui-body\">\r\n");
      out.write("\t\t\t<!-- 内容主体区域 -->\r\n");
      out.write("\t\t\t<div style=\"padding: 15px;text-align:center;font-size: 65px;text-shadow: 70px -15px 8px grey;position:relative;top: 30%;left:0%;font-family: monospace;\" >Welcome to the admin interface</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/public/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t//JavaScript代码区域\r\n");
      out.write("\tlayui.use('element', function() {\r\n");
      out.write("\t\tvar element = layui.element;\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
