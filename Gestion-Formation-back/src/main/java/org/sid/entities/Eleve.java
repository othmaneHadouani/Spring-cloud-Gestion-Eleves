package org.sid.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Eleve {


    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String niveau;
    private int age;
    private String adresse;
    private String tel;

    public Eleve(String nom, String prenom, String niveau, int age, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.niveau = niveau;
        this.age = age;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Eleve() {
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNiveau() {
        return niveau;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
