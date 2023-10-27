public class Interview {
    public static void main(String[] args) {

        InterviewResultFactory factory = new InterviewResultFactory();

        System.out.println("Positive response:\n");
        factory.positiveResponse().generateResponse();
        System.out.println("Advanced to next stage response:\n");
        factory.passedToNextStageResponse().generateResponse();
        System.out.println("Negative response:\n");
        factory.negativeResponse().generateResponse();
    }
}

interface Response {
    void generateResponse();
}

class InterviewResponse implements Response{
    private final String opening;
    private final String mainMessage;
    private final String closing;

    public InterviewResponse(String opening, String mainMessage, String closing) {
        this.opening = opening;
        this.mainMessage = mainMessage;
        this.closing = closing;
    }

    @Override
    public void generateResponse() {

        String sb = opening + "\n" +
                mainMessage + "\n" +
                closing + "\n\n";

        System.out.println(sb);
    }
}

class InterviewResultFactory {
    public InterviewResponse positiveResponse() {
        String opening = "Congratulations! You have passed the interview.";
        String mainMessage = "We are pleased to offer you the applied position in our company.";
        String closing = "We look forward to hearing from you soon.";

        return new InterviewResponse(opening, mainMessage, closing);
    }

    public InterviewResponse passedToNextStageResponse() {
        String opening = "Great news!";
        String mainMessage = "You have successfully advanced to the next stage.";
        String closing = "Prepare and excel in the next round.";

        return new InterviewResponse(opening, mainMessage, closing);
    }

    public InterviewResponse negativeResponse() {
        String opening = "We appreciate your time and effort in the interview process.";
        String mainMessage = "We regret to inform you that we have decided not to move forward at this time.";
        String closing = "We encourage you to work on the areas we discussed and consider reapplying in the future.";

        return new InterviewResponse(opening, mainMessage, closing);
    }
}
