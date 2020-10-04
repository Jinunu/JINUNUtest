package work.cellPhone;

public class CellPhone {

	private String model;
	private int time;
	private double battery;
	
	public CellPhone() {
		
	}
	
	public CellPhone(String model) {
		this.model=model;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}
	
	public void call(int time)throws IllegalArgumentException{
		
		if(time<0) {
				throw new IllegalArgumentException("��ȭ�ð� �Է¿���"); //���� �������.
			}
		else {
		this.battery=this.battery-(time*0.5);
		if(this.battery<=0) {this.battery=0;}
		System.out.println("��ȭ �ð� : "+time+"��");
		}
		// Exception ó�� �ؾ���..
	}
	
	public void charge(int time) {
		
		this.battery=this.battery+(time*3);
		if(this.battery>=100) {this.battery=100;}
		System.out.println("�����ð� : "+time+"��");
	}
	
	public  void printBattery() {
		System.out.println("���� ���͸� �� : "+this.getBattery());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CellPhone))
			return false;
		CellPhone other = (CellPhone) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	
}
