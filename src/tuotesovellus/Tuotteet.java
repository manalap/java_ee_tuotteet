package tuotesovellus;

import java.util.*;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Tuotteet {
    private ArrayList<Tuote> tuotteet;

    public Tuotteet() {
        tuotteet = new ArrayList<Tuote>();
        tuotteet.add(new Tuote("Microsoft Office Standard", "#MO5345f089JT", 736.90, 12));
        tuotteet.add(new Tuote("HP Elitebook", "#XM592AA65UUW", 398.90, 18));
        tuotteet.add(new Tuote("Nokia Lumia 640 XL", "#65064508AF01A00", 399.90, 29));
        tuotteet.add(new Tuote("Adobe Acrobat Pro 7.0", "#HA2202015473", 623.90, 45));
        tuotteet.add(new Tuote("Sony Bravia 40 Full HD", "#K5435534L40EX402", 699.90, 33 ));
        tuotteet.add(new Tuote("Apple iPad Pro","#APPTKLF50159476FDS", 655.90 ,2));
        tuotteet.add(new Tuote("Microsoft Surface Pro", "#MS027175X8JKY", 589.90, 89));
        tuotteet.add(new Tuote("Apple Mac OS X", "#APP534563MC573", 27.90, 43));
        tuotteet.add(new Tuote("F-Secure Internet Security", "#FCI650OE1N001FI", 29.90, 23));
        tuotteet.add(new Tuote("Samsung S6", "#SAM00565442M115", 449.90, 76));        
    }

    public void setTuote(Tuote t) {
        tuotteet.add(t);
    }

    public ArrayList<Tuote> getTuotelista() {
        return tuotteet;
    }

    @Override
    public String toString() {
        return "Tuotteet:\n " + tuotteet.toString();
    }

    public ArrayList<Tuote> sorted() {
        java.util.Collections.sort(tuotteet);
        return tuotteet;
    }

    // Lisätään uusi tuote ArrayListaan
    public String lisaaUusi() {
       FacesContext facesContext = FacesContext.getCurrentInstance();
       Tuote t = (Tuote)facesContext.getExternalContext().getRequestMap().get("tuote");
       //Tuotteet tuotteet = (Tuotteet)facesContext.getExternalContext().getSessionMap().get("tuotteet");
       tuotteet.add(t);
       return "index";
    }
}
