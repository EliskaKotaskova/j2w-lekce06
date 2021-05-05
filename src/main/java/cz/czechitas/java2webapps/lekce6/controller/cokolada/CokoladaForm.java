package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import cz.czechitas.java2webapps.lekce6.controller.cokolada.Velikost;

import javax.validation.constraints.*;

public class CokoladaForm {
    @NotBlank
    private String zbozi;
    @NotNull
    private Velikost velikost;
    @NotBlank
    private String jmeno;
    @Email
    private String email;
    @AssertTrue
    private boolean obchodniPodminky;

    public String getZbozi() {
        return zbozi;
    }

    public void setZbozi(String zbozi) {
        this.zbozi = zbozi;
    }

    public Velikost getVelikost() {
        return velikost;
    }

    public void setVelikost(Velikost velikost) {
        this.velikost = velikost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }
}
