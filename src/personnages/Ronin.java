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
	public void provoquerDuel(Yakuza adversaire){
		System.out.println("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur*2;
		if (force>=adversaire.getReputation()) {
			int argentDuel=adversaire.getArgent();
			gagnerArgent(argentDuel);
			adversaire.perdreArgent(argentDuel);
			honneur++;
			System.out.println("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			honneur-=1;
			int argentDuel=getArgent();
			perdreArgent(argentDuel);
			System.out.println("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentDuel);
			
		}
		
	}

}
