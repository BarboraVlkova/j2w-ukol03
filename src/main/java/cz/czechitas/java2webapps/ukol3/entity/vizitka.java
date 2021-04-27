package cz.czechitas.java2webapps.ukol3.entity;

public class vizitka {
    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPsc;
    private String celaAdresa;
    private String telefon;
    private String email;
    private String webovaAdresa;

    public vizitka() {
    }

    public vizitka(String jmeno, String firma, String ulice, String obecPsc, String celaAdresa, String telefon, String email, String webovaAdresa) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.celaAdresa = celaAdresa;
        this.telefon = telefon;
        this.email = email;
        this.webovaAdresa = webovaAdresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }


//    (READ ONLY PROPERTY ve tvaru: „ulice, obecPsc“)
    public String getCelaAdresa() {
        return ulice + "," + obecPsc;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebovaAdresa() {
        return webovaAdresa;
    }

    public void setWebovaAdresa(String webovaAdresa) {
        this.webovaAdresa = webovaAdresa;
    }

}