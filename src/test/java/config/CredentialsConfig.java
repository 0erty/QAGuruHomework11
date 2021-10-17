package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:resources/credentials.properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
