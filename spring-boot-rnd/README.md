# spring-boot-rnd
spring boot basic project setup

1. Minify pluging - 
all files r specified in css or js
 ref:  http://samaxes.github.com/minify-maven-plugin  or https://github.com/ajitchahal/minify-maven-plugin
https://github.com/soulgalore/maven-minify-sample
2. @WebFilter(filterName = "SourceMapFilter", urlPatterns = { "/js/script.min.js" })
public class SourceMapFilter implements Filter {
