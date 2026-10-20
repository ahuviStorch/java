package Factory;

public class GPT_5_Mini extends LLMModels {

	 public GPT_5_Mini() {
		super("GPT_5_Mini");
	 }
	 
	  @Override
	    public void sendPrompt(String prompt) {
	       System.out.println("[" + getModelName() + "] the prompt : "+prompt);
	    }	
	
	
}
