package Factory;

public class Gemini extends LLMModels {
    public Gemini() {
        super("Gemini");
    }

    @Override
    public void sendPrompt(String prompt) {
       System.out.println("[" + getModelName() + "] the prompt : "+prompt);
    }
}