package ro.ctrln.java;

public class OverloadingGenerics {

    public void showMessage(MessageProcessor<String> messageProcessor) {
        messageProcessor.prinData("Mesaj!");
    }

//    public void showMessage(MessageProcessor<Integer> messageProcessor) {
//        messageProcessor.prinData(20);
//    }
}
