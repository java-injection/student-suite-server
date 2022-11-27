package it.ji.server.utils;

import io.getunleash.DefaultUnleash;
import io.getunleash.Unleash;
import io.getunleash.UnleashContext;
import io.getunleash.util.UnleashConfig;

public class UnleashManager {

    private static UnleashManager instance;
    private Unleash unleash;

    private UnleashManager() {
        UnleashConfig config = UnleashConfig.builder()
                .appName("student-suite-server")
                .instanceId("your-instance-1")
               // .environment(System.getenv("APP_ENV"))
                .environment("development")
                .unleashAPI("https://unleash.java-injection.dev/api/")
                .customHttpHeader("Authorization", "*:development.77afdb7d4f668947a30af90f8333c063bbb1ff26327210083f9fbe35")
                .build();

        unleash = new DefaultUnleash(config);
    }

    public static UnleashManager getInstance() {
        if (instance == null) {
            instance = new UnleashManager();
        }
        return instance;
    }

    public boolean isFeatureEnabled(String featureName) {
        UnleashContext context = UnleashContext.builder()
                .environment("development")
                .appName("student-suite-server")
                .userId("user@mail.com").build();
        return this.unleash.isEnabled(featureName,context);
    }

}
