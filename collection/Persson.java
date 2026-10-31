package collection;

public class Persson extends Voice{
private int year;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
	if(year<1){
		setTypeVoice("cry") ;
	}else{
		setTypeVoice("utter words");
	}
}

public Persson(int year) {
	super();
	this.year = year;
	if(year<1){
		typeVoice = "cry";
	}else{
		typeVoice = "utter words";
	}
}



	
	
	
}
