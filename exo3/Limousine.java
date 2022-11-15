public class Limousine extends Voiture {

  private int longueur;

  public Limousine(int vMax, double prixVente, String couleur, int longueur) {
    super(vMax, prixVente, couleur);
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente() {
    if (longueur > 6) {
      return super.calculerPrixDeVente()*0.95;
    } else {
      return super.calculerPrixDeVente()*0.90;
    }
  }
}