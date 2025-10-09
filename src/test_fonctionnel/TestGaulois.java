package test_fonctionnel;

import personnages.Chaudron;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Chaudron chaudron = new Chaudron(0, 0);
		Druide panoramix = new Druide("Panoramix", 2, chaudron);
		
		
		asterix.parler("Bonjour Obelix");
		obelix.parler("Bonjour, asterix, Ca te dirais d'aller chasser les sangliers ? ");
		asterix.parler("Oui très bonne idée !!");
		System.out.println("Dans la forêt Asterix et Obelix tombent nez à nez avec le romain Minus");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
	}
}
