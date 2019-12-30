package org.sid;

import org.sid.dao.EleveRepository;
import org.sid.entities.Eleve;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;


@EnableDiscoveryClient
@EnableConfigurationProperties
@SpringBootApplication
public class GestionFormationBackApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestionFormationBackApplication.class, args);
    }

    public ArrayList<Eleve> eleves =new ArrayList<Eleve>();

    @Bean
    CommandLineRunner start(EleveRepository eleveRepository){
        eleves.add(new Eleve("othmane","hadouani","6eme",23,"05 bd abd erarhim bouabid tissir 2","0626884346"));
        eleves.add(new Eleve("souad","bassir","5eme",10,"05 bd abd erarhim bouabid tissir 2","0626884346"));
        eleves.add(new Eleve("sanaa","barik","cp1",23,"05 bd abd erarhim bouabid tissir 2","0626884346"));
        eleves.add(new Eleve("imad","ben","3eme",23,"05 bd abd erarhim bouabid tissir 2","0626884346"));
        return args -> {
            eleves.forEach(cn->{

                eleveRepository.save(cn);
            });
            eleveRepository.findAll().forEach(System.out::println );
        };
    }

}
