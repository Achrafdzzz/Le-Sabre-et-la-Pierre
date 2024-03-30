package personnages;

public class Ronin extends Humain {
	
	private int honneur=1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		}
	
	public void donner(Commercant beneficiaire){
		int dons=getArgent()/10;
		parler(beneficiaire.getNom() + " prends ces " + dons + " sous");
		beneficiaire.recevoir(dons);
		perdreArgent(dons);
		
	}
	

}
