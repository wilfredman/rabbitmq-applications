
package org.application.rabbitmq.datadiode.udp.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

import java.io.IOException;

@SpringBootApplication
@EnableIntegration
@ImportResource("integration.xml")
public class UdpInternalStarter {
    private static final Logger log = LoggerFactory.getLogger(UdpInternalStarter.class);

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(UdpInternalStarter.class).web(false).run(args);
        configurableApplicationContext.start();
    }
}
