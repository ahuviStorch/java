package collection;

public abstract class Voice {
protected String typeVoice = "";

public String getTypeVoice() {
	return typeVoice;
}

public void setTypeVoice(String typeVoice) {
	this.typeVoice = typeVoice;
}

public void makeSound(){
	System.out.println("the type voice is : "+typeVoice);
}

}
