package com.wak.dispatch.config.datasource;

import org.apache.catalina.connector.Connector;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.Answer on 2018-12-09 16:51
 *
 * 配置启用多个监听端口
 *
 * TomcatEmbeddedServletContainerFactory
 */
@Configuration
public class EmbeddedTomcatConfiguration {

//    @Value("${server.additionalPorts}")
//    private String additionalPorts;
//
//    @Bean
//    public TomcatServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        Connector[] additionalConnectors = this.additionalConnector();
//        if (additionalConnectors != null && additionalConnectors.length > 0) {
//            tomcat.addAdditionalTomcatConnectors(additionalConnectors);
//        }
//        return tomcat;
//    }
//
//    private Connector[] additionalConnector() {
//        if (StringUtils.isBlank(this.additionalPorts)) {
//            return null;
//        }
//        String[] ports = this.additionalPorts.split(",");
//        List<Connector> result = new ArrayList<>();
//        for (String port : ports) {
//            Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//            connector.setScheme("http");
//            connector.setPort(Integer.valueOf(port));
//            result.add(connector);
//        }
//        return result.toArray(new Connector[]{});
//    }
}