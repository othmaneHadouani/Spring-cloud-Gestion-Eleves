package org.sid.metier;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@RefreshScope
@ConfigurationProperties("mes-configs")
@Service
public class ApplicationPropertiesConfigurationImpl implements IApplicationPropertiesConfiguration {

    private int limitProduits;

    public int getLimitDeProduits(){
        return limitProduits;
    }

    public void setLimitDeProduits(int limitProduits){
        this.limitProduits =  limitProduits;
    }
}
