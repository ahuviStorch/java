package Factory;

public class LLMModelFactory {
	public static final String CODE_GENERATION = "CODE_GENERATION";
    public static final String SUMMARIZATION = "SUMMARIZATION";
    public static final String DOCUMENT_ANALYSIS = "DOCUMENT_ANALYSIS";
    public static final String SIMPLE_QUESTION = "SIMPLE_QUESTION";
    public static final String COMPLEX_ANALYSIS = "COMPLEX_ANALYSIS";
	
    public static LLMModels getModel(String activity){
    	if (activity == null) {
    	    throw new IllegalArgumentException("הפעילות אינה יכולה להיות null");
    	}
    	switch(activity){
    		case CODE_GENERATION:  
    			return new ClaudeSonnet();
    		case SUMMARIZATION:
    			return new Gemini();
    		case DOCUMENT_ANALYSIS:
    			return new Gemini();
    		case SIMPLE_QUESTION:
    			return new GPT_5_Mini();
    		case COMPLEX_ANALYSIS:
    			return new GPT_5();
    		default:	throw new IllegalArgumentException("פעילות לא מוכרת: " + activity);
    	}
    	
    	
    	
    }
    
    
    
}
