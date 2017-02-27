package builder;

class WelcomeBuilder extends Builder {
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

	@Override
	public void buildSubject() {
		msg.setBody("»¶Ó­ÄÚÈİ");
	}

	@Override
	public void buildBody() {
		msg.setSubject("»¶Ó­±êÌâ");
	}


}
