package org.sid.metier;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@RefreshScope

public class ApplicationPropertiesConfiguration {

    private int limitProduits;

    public int getLimitDeProduits(){
        return limitProduits;
    }

    public void setLimitDeProduits(int limitProduits){
        this.limitProduits =  limitProduits;
    }
}
