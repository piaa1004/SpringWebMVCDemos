package com.ysy.webmvc.viewtech.xmlmarshalling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.xml.MarshallingView;

/**
 * XML Marshalling — JAXB (jakarta.xml.bind) 기반 {@link Jaxb2Marshaller} 를 {@link MarshallingView} 가 사용.
 */
@Configuration
@ComponentScan(basePackageClasses = XmlController.class)
public class WebConfig {

    @Bean
    public Jaxb2Marshaller jaxbMarshaller() {
        Jaxb2Marshaller m = new Jaxb2Marshaller();
        m.setClassesToBeBound(Person.class);
        return m;
    }

    @Bean
    public View personXml() {
        return new MarshallingView(jaxbMarshaller());
    }
}
