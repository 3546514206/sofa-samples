package edu.zjnu.biz;

import com.alipay.sofa.healthcheck.core.HealthChecker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @author 杨海波
 * @date 2024/2/1 15:57
 * @description 如果想要在 SOFABoot 的 Readiness Check 里面增加一个检查项，可以直接扩展该接口。
 * 相较于 Spring Boot 本身的 HealthIndicator 接口，该接口提供了一些额外的参数配置，比如检查失败重试次数等。
 */
@Component
public class ActuatorHealthChecker implements HealthChecker {

    @Value("${actuator.health.checker.retry.count}")
    private String actuatorHealthCheckerRetryCount;

    @Override
    public Health isHealthy() {
        return Health.up().withDetail("actuatorHealthChecker", "ok").build();
    }

    @Override
    public String getComponentName() {
        return "actuatorHealthChecker";
    }

    @Override
    public int getRetryCount() {
        int actuatorHealthCheckerRetryCountInt = 0;
        try {
            actuatorHealthCheckerRetryCountInt = Integer.parseInt(actuatorHealthCheckerRetryCount);
        } catch (NumberFormatException e) {
            // do nothing,return 0
            return actuatorHealthCheckerRetryCountInt;
        }

        return actuatorHealthCheckerRetryCountInt;
    }

    @Override
    public long getRetryTimeInterval() {
        return HealthChecker.super.getRetryTimeInterval();
    }

    @Override
    public boolean isStrictCheck() {
        return HealthChecker.super.isStrictCheck();
    }
}
