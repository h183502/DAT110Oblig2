package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method

    private String subscribe;

    public SubscribeMsg(String user, String subscribe){
        super(MessageType.SUBSCRIBE, user);
        this.subscribe = subscribe;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public String toString() {
        return super.toString() + " Subscription = " + this.subscribe;
    }
}
