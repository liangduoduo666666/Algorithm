package strategy;

//��ʼ��Ա�ۿ���
 class PrimaryMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double booksPrice) {
        
        System.out.println("���ڳ�����Ա��û���ۿ�");
        return booksPrice;
    }

}
