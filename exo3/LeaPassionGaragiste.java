public class LeaPassionGaragiste {
  public static void main(String[] args) {

    Camion marcel = new Camion(520, 100, "bleu", 1900);
    System.out.println("Prix : " + marcel.calculerPrixDeVente());
  }
}