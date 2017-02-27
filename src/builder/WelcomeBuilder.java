package builder;

class WelcomeBuilder extends Builder {
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

	@Override
	public void buildSubject() {
		msg.setBody("��ӭ����");
	}

	@Override
	public void buildBody() {
		msg.setSubject("��ӭ����");
	}


}
