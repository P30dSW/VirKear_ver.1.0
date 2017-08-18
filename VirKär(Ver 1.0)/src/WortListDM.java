import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WortListDM {
	
	//In dieser Attribut wird das Kärchen gespeichert
	private ArrayList<WortList> Woerterliste = new ArrayList<WortList>();
	
	//get Methode vom Woerterliste
	public  ArrayList<WortList> getWoerterliste(){
		return Woerterliste;
	}
	//set Methode von Woerterliste
	public  void setWoerterliste(ArrayList<WortList> newWoerterliste){
		Woerterliste = newWoerterliste;
	}

	//Diese Methode checkt, ob Woerterliste leer ist. geb einen Boolean aus
	public boolean isWoerterlisteEmpty(){
		if(Woerterliste.isEmpty() == true){
			return true;
		}else{
			return false;

		}
		
	}
	//Diese methode gibt die genaue länge des Woerterliste. Gibt einen Integer aus
	public int lengthOfWoerterliste(){
		return Woerterliste.size();
	}
	
	//Diese Mwethode lösch alle Elemnte, die man in den ArrayList Woerterliste findet
	public void deleteWoerterliste(){
		Woerterliste.clear();
	}
}

