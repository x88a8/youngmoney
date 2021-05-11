public class KUNDE {
    private String[] name;
    private String[] adresse;
    private int[] konten;

    public KUNDE(String vorname, String nachname, String strasse, String hausnummer, String ort, String plz) {
        name = new String[2];
        adresse = new String[4];
        konten = new int[5];
        name[0] = vorname;
        name[1] = nachname;
        adresse[0] = strasse;
        adresse[1] = hausnummer;
        adresse[2] = ort;
        adresse[3] = plz;
    }
}
