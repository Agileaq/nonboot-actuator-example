package personal.arc.nonboot.actuator.example.custom;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * Created by Arc on 17/8/2016.
 */
@Component
public class FakeRabbitMQHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.withDetail("connection", "OK");
        builder.withDetail("channel", "OK");
        builder.up();
    }
}
