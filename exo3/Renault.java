public class Renault extends Voiture {

  private int anneeFabrication;
  private int reducConstructeur;

  public Renault(int vMax, double prixVente, String couleur, int anneeFabrication, int reducConstructeur) {
    super(vMax, prixVente, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reducConstructeur = reducConstructeur;
  }

  @Override
  public double calculerPrixDeVente() {
    return super.calculerPrixDeVente() - reducConstructeur;
  }
}