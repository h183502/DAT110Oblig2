package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method

    private String message;
    private String topic;

    public PublishMsg(String user, String topic, String message){
        super(MessageType.PUBLISH, user);
        this.message = message;
        this.topic  = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + " Topic = " + this.topic + " Message = " + this.message;
    }
}
