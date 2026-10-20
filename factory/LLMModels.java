package Factory;

public abstract class LLMModels {

	private String modelName;

    public LLMModels(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    // מתודה אבסטרקטית לשליחת Prompt
    public abstract void sendPrompt(String prompt);
}
	

