package work.cellPhone;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		
		myPhone.call(300);
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40);
		myPhone.printBattery();
		
		try {
			myPhone.call(-20);
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			
		}
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if(myPhone.equals(yourPhone)) { //모델을 비교 하고 싶기 때문에 Object의 equals method O.R 해서 모델 비교 할 수 있게만들어줌.
			System.out.println("동일 모델입니다");
		}else {
			System.out.println("다른 모델입니다");
		}
		System.out.println(myPhone.hashCode());
	}
	
	
}
