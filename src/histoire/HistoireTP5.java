package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
		Commercant chonin = new Commercant("Chonin",40);
		Commercant kumi = new Commercant("Kumi",10);
		Yakuza yaku = new Yakuza("Yaku","whisky",30,"warsong");
		Ronin roro = new Ronin("Roro","Shoshu",60);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
	}

}
