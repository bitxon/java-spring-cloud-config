package bitxon.scc.client.userservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "message")
public class MessageProperties {
    private String global;
    private String service;
    private String env;
}
