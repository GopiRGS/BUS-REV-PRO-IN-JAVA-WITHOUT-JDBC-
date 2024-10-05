package busRev;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;//get and set method
	
	Bus(int busNo,boolean ac,int capacity){
		this.busNo = busNo;
		this.ac = ac;
		this.capacity =capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	
	public void setcapacity(int capacity) {
		this.capacity= capacity;
	}
	public boolean getac() {
		return ac;
	}
	public void setac(boolean ac) {
		this.ac = ac;
	}

	//no need for set method because it is constant
	public int getbusNo() {
		// TODO Auto-generated method stub
		return busNo;
	}
	public void displayBusInfo() {
		System.out.println("Bus No is : "+busNo+" "+"Ac : "+ac+" "+"Total capacity is : "+capacity);
	}
	
}

