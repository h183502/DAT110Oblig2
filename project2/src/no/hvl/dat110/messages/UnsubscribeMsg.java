package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method

    private String subscrive;

    public UnsubscribeMsg(String user, String subscrive){
        super(MessageType.UNSUBSCRIBE, user);
        this.subscrive = subscrive;
    }

    public String getSubscrive() {
        return subscrive;
    }

    public void setSubscrive(String subscrive) {
        this.subscrive = subscrive;
    }

    @Override
    public String toString() {
        return super.toString() + " Unsubscrive = " + this.subscrive;
    }
}
