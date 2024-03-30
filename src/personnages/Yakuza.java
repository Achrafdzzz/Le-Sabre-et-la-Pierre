package personnages;

public class Yakuza extends Humain{
	
	private int reputation=0;
	private String clan;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		System.out.println("tiens tiens ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println( victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentGagne=victime.getArgent();
		victime.seFaireExtorquer();
		gagnerArgent(argentGagne);
		System.out.println("j'ai piqué les " + argentGagne + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi Hi !");
		reputation++;
	}

}
