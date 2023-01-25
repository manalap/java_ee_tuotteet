package tuotesovellus;

import javax.validation.constraints.*;
import javax.faces.bean.*;

//@javax.faces.bean.ManagedBean
//@javax.faces.bean.RequestScoped

@ManagedBean
@RequestScoped
public class Tuote implements Comparable<Tuote> {
    @Size(min=1, max=40)
    private String nimi;
    @Size(min=1, max=20)
    private String koodi;
    @Min(0)
    @Max(5000)
    private double hinta;
    @Size(min=1, max=100)
    private int maara;

    public Tuote() {
    }

    public Tuote(String nimi, String koodi, double hinta, int maara) {
        this.nimi=nimi;
        this.koodi=koodi;
        this.hinta=hinta;
        this.maara=maara;
    }

    @Override
    public String toString() {
        return "[" + nimi + ", " + koodi + " ," + hinta + " määrä " + "]\n";
    }

    /**
     * @return the nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * @param nimi the nimi to set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * @return the koodi
     */
    public String getKoodi() {
        return koodi;
    }

    /**
     * @param koodi the koodi to set
     */
    public void setKoodi(String koodi) {
        this.koodi = koodi;
    }

    /**
     * @return the hinta
     */
    public double getHinta() {
        return hinta;
    }

    /**
     * @param hinta the hinta to set
     */
    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
    
    /**
     * @return the hinta
     */
    public int getMaara() {
        return maara;
    }

    /**
     * @param hinta the hinta to set
     */
    public void setMaara(int maara) {
        this.maara = maara;
    }

    public int compareTo(Tuote t1) {
        double tulos = t1.getHinta() - this.getHinta();
        if (tulos ==0) return 0;
        if (tulos > 0) return 1;
        return -1;
    }
}
