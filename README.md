Spring MVC Initializer Example
==============================

Basic Spring MVC 4.0.x application using `WebApplicationInitializer` instead of `web.xml`.

Check out [kielczewski.eu/blog](http://kielczewski.eu/blog)!

Requirements
------------
* [Java Platform (JDK) 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

Quick start
-----------
1. `mvn jetty:run`
2. Point your browser to [http://localhost:8080/](http://localhost:8080/)

# Log

```
[INFO] Configuring Jetty for project: Spring MVC Initializer Example
[INFO] webAppSourceDirectory not set. Trying src\main\webapp
[INFO] Reload Mechanic: automatic
[INFO] Classes = G:\Working\source_code\git_source\example-spring-mvc-initializer\target\classes
[INFO] Context path = /
[INFO] Tmp directory = G:\Working\source_code\git_source\example-spring-mvc-initializer\target\tmp
[INFO] Web defaults = org/eclipse/jetty/webapp/webdefault.xml
[INFO] Web overrides =  none
[INFO] web.xml file = null
[INFO] Webapp directory = G:\Working\source_code\git_source\example-spring-mvc-initializer\src\main\webapp
[INFO] jetty-9.0.6.v20130930
[INFO] Spring WebApplicationInitializers detected on classpath: [eu.kielczewski.example.initializer.AppInitializer@3ad847f8]
[INFO] Initializing Spring root WebApplicationContext
Mar 04, 2016 5:25:41 PM org.springframework.web.context.ContextLoader initWebApplicationContext
INFO: Root WebApplicationContext: initialization started
Mar 04, 2016 5:25:42 PM org.springframework.web.context.support.AnnotationConfigWebApplicationContext prepareRefresh
INFO: Refreshing Root WebApplicationContext: startup date [Fri Mar 04 17:25:42 ICT 2016]; root of context hierarchy
Mar 04, 2016 5:25:42 PM org.springframework.web.context.support.AnnotationConfigWebApplicationContext loadBeanDefinitions
INFO: Found 2 annotated classes in package [eu.kielczewski.example.config]
Mar 04, 2016 5:25:42 PM org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor <init>
INFO: JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
Mar 04, 2016 5:25:42 PM org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping register
INFO: Mapped "{[/],methods=[GET]}" onto public java.lang.String eu.kielczewski.example.controller.IndexController.showIndex()
Mar 04, 2016 5:25:42 PM org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter initControllerAdviceCache
INFO: Looking for @ControllerAdvice: Root WebApplicationContext: startup date [Fri Mar 04 17:25:42 ICT 2016]; root of context hierarchy
Mar 04, 2016 5:25:42 PM org.springframework.web.context.ContextLoader initWebApplicationContext
INFO: Root WebApplicationContext: initialization completed in 839 ms
[INFO] Initializing Spring FrameworkServlet 'DispatcherServlet'
Mar 04, 2016 5:25:42 PM org.springframework.web.servlet.DispatcherServlet initServletBean
INFO: FrameworkServlet 'DispatcherServlet': initialization started
Mar 04, 2016 5:25:42 PM org.springframework.web.servlet.DispatcherServlet initServletBean
INFO: FrameworkServlet 'DispatcherServlet': initialization completed in 17 ms
[INFO] Started o.e.j.m.p.JettyWebAppContext@5b852b49{/,file:/G:/Working/source_code/git_source/example-spring-mvc-initializer/src/main/webapp/,AVAILABLE}{file:/G:/Working/source_code/git_source/example-spring-mvc-initializer/src/main/webapp/}
[WARNING] !RequestLog
[INFO] Started ServerConnector@5c3710b3{HTTP/1.1}{localhost:8080}
[INFO] Started Jetty Server
[INFO] Starting scanner at interval of 10 seconds.
[INFO] Stopped ServerConnector@5c3710b3{HTTP/1.1}{localhost:8080}
[INFO] Destroying Spring FrameworkServlet 'DispatcherServlet'
[INFO] Closing Spring root WebApplicationContext
[INFO] javax.el.BeanELResolver purged
[INFO] Stopped o.e.j.m.p.JettyWebAppContext@5b852b49{/,file:/G:/Working/source_code/git_source/example-spring-mvc-initializer/src/main/webapp/,UNAVAILABLE}{file:/G:/Working/source_code/git_source/example-spring-mvc-initializer/src/main/webapp/}
[INFO] Jetty server exiting.
[INFO] ------------------------------------------------------------------------Terminate batch job (Y/N)? y

```