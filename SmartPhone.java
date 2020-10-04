package work;

public class SmartPhone extends CellPhone {
	private boolean isMonthlyFixedFee;
	private int monthlyFixedFee;

	public SmartPhone() {
		
	}

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime,boolean isMonthlyFixedFee, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedFee=isMonthlyFixedFee;
		this.monthlyFixedFee=monthlyFixedFee;
		System.out.println("고객님은 "+monthlyFixedFee+" 정액 요금제 입니다.");
	}

	public boolean isMonthlyFixedFee() {
		return isMonthlyFixedFee;
	}
	
	public void setMonthlyFixedFee(boolean isMonthlyFixedFee) {
		this.isMonthlyFixedFee = isMonthlyFixedFee;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	


}
