package builder;

class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    @Override
    public void buildBody() {
    	msg.setBody("»¶ËÍÄÚÈİ");
    }

    @Override
    public void buildSubject() {
    	msg.setSubject("»¶ËÍ±êÌâ");
    }

}
