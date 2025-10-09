package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	private boolean aVillage = false;
	private boolean isChef = false;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setVilage(Village village) {
		this.village = village;
		aVillage = true;
	}

	public Village getVillage() {
		return this.village;

	}

	public void sePresenter() {
		if (isChef) {
			parler("\"Bonjour je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");					
		} else if (aVillage) {
			parler("\"Bonjour je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".");
		} else {
			parler("\"Bonjour je m'appelle " + nom + ". Je voyage de village en village" + ".");
		}

	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " Envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((this.force * this.effetPotion) / 3);
		if (this.effetPotion > 1) {
			this.effetPotion--;
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
	}
}
