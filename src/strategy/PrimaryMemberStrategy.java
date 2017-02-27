package strategy;

//初始会员折扣类
 class PrimaryMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double booksPrice) {
        
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }

}
