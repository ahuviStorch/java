package Factory;

public class ClaudeSonnet extends LLMModels {
    public ClaudeSonnet() {
        super("Claude Sonnet");
    }

    @Override
    public void sendPrompt(String prompt) {
       System.out.println("[" + getModelName() + "] the prompt : "+prompt);
    }
}