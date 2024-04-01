package personnages;

public class Yakuza extends Humain {

	private int reputation = 1;
	private String clan;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		System.out.println("tiens tiens ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentGagne = victime.getArgent();
		victime.seFaireExtorquer();
		gagnerArgent(argentGagne);
		System.out.println("j'ai piqué les " + argentGagne + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getArgent() + " sous dans ma poche. Hi Hi !");
		reputation++;
	}

	public int perdre() {
		System.out.println(getArgent());
		int argentDuel = getArgent();
		perdreArgent(argentDuel);
		reputation += -1;
		System.out.println("J’ai perdu mon duel et mes " + argentDuel + " sous, snif... J'ai déshonoré le clan de" + clan);
		return 0;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		System.out.println("Ce ronin pensait vraiment battre" + getNom() + " du clan de " + clan
				+ " ? Je l'ai dépouillé de ses " + gain + " sous");
	}

}
