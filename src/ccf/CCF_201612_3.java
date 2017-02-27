package ccf;
import java.util.ArrayList;
import java.util.Scanner;

public class CCF_201612_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int index = 0 ;
		String action;
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		hero1.setHP(30);
		hero2.setHP(30);
		int huihe = 0;
		int flag = 0;
		while(index<N){
			action = scan.nextLine();
			String[] actions = action.split(" ");
			if(actions[0].equals("summon")){
				if(huihe%2==0){
					int position = Integer.parseInt(actions[1]);
					int attack = Integer.parseInt(actions[2]);
					int health = Integer.parseInt(actions[3]);
					Summon summon = new Summon(position,attack,health);
					hero1.summons.add(position-1, summon);
				}else{
					int position = Integer.parseInt(actions[1]);
					int attack = Integer.parseInt(actions[2]);
					int health = Integer.parseInt(actions[3]);
					Summon summon = new Summon(position,attack,health);
					hero2.summons.add(position-1, summon);
				}
			}else if(actions[0].equals("attack")){
				if(huihe%2==0){
					int position1 = Integer.parseInt(actions[1]);
					int position2 = Integer.parseInt(actions[2]);
					int attack1 = hero1.summons.get(position1-1).getAttack();					
					if(position2!=0){											
						int attack2 = hero2.summons.get(position2-1).getAttack();											
						int afterHP = hero1.summons.get(position1-1).getHealth()-attack2;
						if(afterHP<=0){
							hero1.summons.remove(position1-1);
						}else{
							hero1.summons.get(position1-1).setHealth(afterHP); 
						}											
						int afterHP1 = hero2.summons.get(position2-1).getHealth()-attack1;
						if(afterHP1<=0){
							hero2.summons.remove(position2-1);
						}else{
							hero2.summons.get(position2-1).setHealth(afterHP1); 
						}
					}else{
						int afterHP = hero2.getHP()-attack1;
						if(afterHP<=0){
							hero2.setHP(afterHP);
							flag = 1;	
						}else{
							hero2.setHP(afterHP);
						}
					}
				}else{				
					int position1 = Integer.parseInt(actions[1]);
					int position2 = Integer.parseInt(actions[2]);								
					int attack2 = hero2.summons.get(position1-1).getAttack();
					if(position2!=0){
						int attack1 = hero1.summons.get(position2-1).getAttack();
						int afterHP = hero2.summons.get(position1-1).getHealth()-attack1;
						if(afterHP<=0){
							hero2.summons.remove(position1-1);
						}else{
							hero2.summons.get(position1-1).setHealth(afterHP); 
						}								
						int afterHP1 = hero1.summons.get(position2-1).getHealth()-attack2;
						if(afterHP1<=0){
							hero1.summons.remove(position2-1);
						}else{
							hero1.summons.get(position2-1).setHealth(afterHP1); 
						}
					}else{
						int afterHP = hero1.getHP()-attack2;
						if(afterHP<=0){
							flag = -1;
							hero1.setHP(afterHP);
						}else{
							hero1.setHP(afterHP);
						}
					}
					
				}
			}else{
				huihe+=1;
			}
			index++;
		}
		scan.close();
		System.out.println(flag);
		System.out.println(hero1.getHP());
		ArrayList<Summon> summons1 = hero1.summons;
		System.out.print(summons1.size()+" ");
		for (Summon summon : summons1) {
			System.out.print(summon.getHealth()+" ");
		}
		System.out.println();
		System.out.println(hero2.getHP());
		ArrayList<Summon> summons2 = hero2.summons;
		System.out.print(summons2.size()+" ");
		for (Summon summon : summons2) {
			System.out.print(summon.getHealth()+" ");
		}
	}
}
class Hero{
	public ArrayList<Summon> summons = new ArrayList<Summon>();
	private int HP;
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		this.HP = hP;
	}	
}
class Summon{
	private int position;
	private int attack;
	private int health;
	Summon(){
		
	}
	Summon(int position,int attack,int health){
		this.position = position;
		this.health = health;
		this.attack = attack;	
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}