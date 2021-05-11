public class TEST {
    private static GIROKONTO one = new GIROKONTO(23.00, new KUNDE("Marcus", "Hutchins", "Brooklyn Avenue", "4a", "Gingham", "22323"), 14.00);;
    //check if account can be created with unique numbers

    public static void main(String[] args) {
        one.parameterAusgeben();
    }
}
