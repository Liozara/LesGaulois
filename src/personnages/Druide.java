package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocté " + quantite + " dose de potion magique. Elle a une force de " + forcePotion + ".");
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obelix") {
				this.parler("Non " + gaulois.getNom() + " non!...et tu sais que tu le sais très bien!");
			} else {
				chaudron.prendreLouche();
			}
		} else {
			this.parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion");
		}
	}

}
