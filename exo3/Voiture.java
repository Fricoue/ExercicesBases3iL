public class Voiture {
  
  private final int vMax;
  private final double prixVente;
  private final String couleur;

  public Voiture(int vMax, double prixVente, String couleur) {
    this.vMax = vMax;
    this.prixVente = prixVente;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente() {
    return prixVente;
  }
}