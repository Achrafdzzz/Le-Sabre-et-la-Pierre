package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	protected void parler(String texte) {
		System.out.println("« " + texte + "»");
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav + ".");

	}

	public void boire() {
		parler("Mmmmm un bon verre de " + boissonFav + " ! Gloups !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous");
		}
	}
	private void memoriser(Humain humain) {
		if (nbConnaissance == 30) {
			for(int i=0;i<30;i++) {
				memoire[i]=memoire[i+1];
			}
		memoire[30] = humain;
		}
		else {
			memoire[nbConnaissance]=humain;
		}
	}
	
	private void repondre() {
		direBonjour();
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre();
		humain.memoriser(this);
		memoriser(humain);
	}
	public void listerConnaissance() {
		System.out.println("Je connais beaucoup de monde dont: ");
		for(int i=0;i<nbConnaissance;i++) {
			System.out.println(memoire[i] + ", ");
		System.out.println(memoire[nbConnaissance]);
		}
	}
}