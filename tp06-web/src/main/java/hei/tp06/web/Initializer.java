package hei.tp06.web;

import hei.tp06.core.config.AppConfig;
import hei.tp06.web.config.DBConfig;
import hei.tp06.web.config.WSConfig;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        Dynamic servlet = servletContext.addServlet("cxfServlet", new CXFServlet());
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/api/*");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AppConfig.class, DBConfig.class, WSConfig.class };
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {};
    }


    @Override
    protected String[] getServletMappings() {
        return new String[] { "/web/" };
    }
}
