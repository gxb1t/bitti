package it.comitatonsmiracolo.website.lotteria.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Premio implements Serializable {

    private static final long serialVersionUID = -5442995531819041106L;

    @Id
    private int id;

    private String titoloPremio;

    private String valorePremio;

    private String numBiglietto;

    private String vendutoDa;

    private String vincitore;

    private String note;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValorePremio() {
        return valorePremio;
    }

    public void setValorePremio(String valorePremio) {
        this.valorePremio = valorePremio;
    }

    public String getTitoloPremio() {
        return titoloPremio;
    }

    public void setTitoloPremio(String titoloPremio) {
        this.titoloPremio = titoloPremio;
    }

    public String getNumBiglietto() {
        return numBiglietto;
    }

    public void setNumBiglietto(String biglietto) {
        this.numBiglietto = biglietto;
    }

    public String getVendutoDa() {
        return vendutoDa;
    }

    public void setVendutoDa(String vendutoDa) {
        this.vendutoDa = vendutoDa;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
