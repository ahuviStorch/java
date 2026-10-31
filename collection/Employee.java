package collection;

public class Employee extends Voice {
private int salery;





public int getSalery() {
	return salery;
}

public void setSalery(int salery) {
	this.salery = salery;
	if(salery>10000){
		typeVoice = "sounds of Joy";
	}else{
		typeVoice = "complainant";
	}
}

public Employee(int salery) {
	super();
	this.salery = salery;
	if(salery>10000){
		typeVoice = "sounds of Joy";
	}else{
		typeVoice = "complainant";
	}
	
}



	
}
