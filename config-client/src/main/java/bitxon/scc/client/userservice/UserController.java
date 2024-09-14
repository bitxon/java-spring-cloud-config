package bitxon.scc.client.userservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final MessageProperties properties;

    @GetMapping(value = "/hello", produces = {"application/json"})
    public Map<String, String> hello() {
        return Map.of(
            "global", properties.getGlobal(),
            "service", properties.getService(),
            "env", properties.getEnv()
        );
    }
}
