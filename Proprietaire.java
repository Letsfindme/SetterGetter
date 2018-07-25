import java.util.*;


/**
 * this class describes the owner of the car
 * @author Fadi NOUFAL
 *
 *
 *@param nom name of the owner
 **@param prenom surname of the owner
 **@param adresse address of the owner
 **@param distance estimated to be used in one year
 *
 */

public class Proprietaire {
     String nom;
     String prenom;
     String adresse;
     String adresseh;
     double distance_parcourue;


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public double getDistance_parcourue() {
		return distance_parcourue;
	}


	public void setDistance_parcourue(double distance_parcourue) {
		this.distance_parcourue = distance_parcourue;
	}

}