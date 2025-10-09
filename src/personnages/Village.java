package personnages;

import java.io.ObjectInputStream.GetField;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int nbMaxVillageois;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(String nom, int nbMaxVillageois, Gaulois chef) {
		this.nom = nom;
		this.nbMaxVillageois = nbMaxVillageois;
		this.villageois = new Gaulois[nbMaxVillageois];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public String getChef() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
		//gaulois.setVilage();
	}

	public Gaulois trouverVillageois(int villageois) {
		if (this.villageois[villageois - 1] == null) {
			System.out.println("Il n'y a pas autant de d'habitants dans le village!");
		} else {
			return this.villageois[villageois - 1];
		}
		return null;
	}

	public void afficherVillage() {
		System.out.println("Dans le village \"" + nom + "\" " + "du chef " + chef + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);
		Village village = new Village("Village des irréductibles", 30, abraracourcix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		asterix.setVilage(village);
		obelix.setVilage(village);
				

		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		System.out.println(asterix.getVillage());
		asterix.sePresenter();
		obelix.sePresenter();
		doublepolemix.sePresenter();
	}

}
