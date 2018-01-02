package ex3.zone;

import java.util.List;

public class SavaneAfricaine extends Zone{
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	@Override
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
