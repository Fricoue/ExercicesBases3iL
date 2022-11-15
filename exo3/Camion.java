public class Camion extends Voiture {
  
  private int poids;

  public Camion(int vMax, double prixVente, String couleur, int poids) {
    super(vMax, prixVente, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixDeVente() {
    if (poids >= 2000) {
      return super.calculerPrixDeVente()*0.9;
    } else {
      return super.calculerPrixDeVente()*0.8;
    }
  }
}