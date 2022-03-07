package datevalid;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidationDate v1=new ValidationDate();
		int jour=12;
		int mois=12;
		int annee=2020;
		if(!v1.validerMois(mois))
			System.out.println("verifiez le mois!");
		else if(!v1.validationAnnee(annee))
			System.out.println("verifiez l'année");
		else if(!v1.verifjour(jour, mois, annee))
			System.out.println("jour incorrecte!");
		else
		{
			System.out.println("date valide");
		}

	}

}
