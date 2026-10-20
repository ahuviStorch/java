package Factory;

public class GPT_5 extends LLMModels{
	public GPT_5() {
        super("GPT-5");
    }

    @Override
    public void sendPrompt(String prompt) {
       System.out.println("[" + getModelName() + "] the prompt : "+prompt);
    }
}
