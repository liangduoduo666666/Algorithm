package builder;

/**
 * ������Director��������ṩһ��construct()�������˷������ý����ߵĽ��췽����
 * ����buildTo()��buildFrom()��buildSubject()��buildBody()��buildSendDate()�ȣ�
 * �Ӷ�һ����һ���ֵؽ������Ʒ���󣬼�AutoMessage����
 * @author zhouliang
 *
 */
class Director {
    Builder builder;
    /**
     * ������
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * ��Ʒ���췽����������ø�����Ľ��췽��
     */
    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}