class TV{
	
	String name;
	int channel;
	channelup = channel++;
	void channelup() {channel++;}
	void channeldown() {channel--;}
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.name = "삼성TV";
		tv1.channel = 30;
		tv1.channelup();
		
		TV tv2 = new TV();
		tv2.name = "LGTV";
		tv2.channel = 20;
		tv2.channeldown();
		
		System.out.println("현재 tv1의 name "+tv1.name);
		System.out.println("현재 tv1의 name "+tv1.channel);
		
		System.out.println("현재 tv2의 name "+tv2.name);
		System.out.println("현재 tv2의 name "+tv2.channel);
	}
}
