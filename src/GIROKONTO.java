import java.util.Random;
public class GIROKONTO extends KONTO{
    private int kontonummer;
    private double kontostand;
    private double ueberziehungsbetrag;
    private double sollzinssatz;
    private double habenzinssatz;
    private KUNDE inhaber;

    public GIROKONTO(double habenzinssatz_new, KUNDE gruender, double ersteinzahlung) {
        Random rd = new Random(); // creating Random object
        kontonummer = rd.nextInt();
        kontostand = 0 + ersteinzahlung;
        ueberziehungsbetrag = 500;
        sollzinssatz = 11;
        habenzinssatz = habenzinssatz_new;
        inhaber = gruender;
    }

    public void parameterAusgeben() {

    }
}
