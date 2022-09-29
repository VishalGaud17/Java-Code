package Lab;



public class Anime_Main {
	public static void main(String[] args) {
		
		Characters ch1 = new Characters("Luffy", "BlackBeard");
		Creators cr1 = new Creators("Echiro Oda","Shonen Jump");
		Anime a1 = new Anime("One Piece",1030,ch1,cr1);
		a1.display();
		
		System.out.println();
		
		Characters ch2 = new Characters("Son Goku", "Dont Know");
		Creators cr2 = new Creators("Akira Toriyama","Shonen Jump");
		Anime a2 = new Anime("Dragon Ball Super",131,ch2,cr2);
		a2.display();

	}
}

