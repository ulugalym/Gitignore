package com.tpe;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Java tabanli web uygulamalar web.xml dosyasi ile config edilir.
//web.xml yerine bu classi kullanacagiz.

//AbstractAnnotation... : classsinin methodlarini override ederekDispatcherServlet'in config ve
// baslatilmasini kolaylastirir.
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
    dispatcher:
             Servlet WebAppContext-->controllers-viewResolver-handlerMapping
             Root WebAppContext-->dataya erisim:services-repos
     */

    @Override
    protected Class<?>[] getRootConfigClasses() {//dataya erisim(hibernate)
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//controllers-viewResolver-handlerMapping
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
