package strategy;

//�߼���Ա�ۿ���
 class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        
        System.out.println("���ڸ߼���Ա���ۿ�Ϊ20%");
        return booksPrice * 0.8;
    }
}
