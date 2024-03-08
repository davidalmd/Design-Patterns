package Devices;

public class DVDevice extends EntertainmentDevice {
    public DVDevice(int newDeviceState, int newMaxSetting){
		
		deviceState = newDeviceState;
		
		maxSetting = newMaxSetting;
		
	}
	
	public void buttonFivePressed() {
		
		System.out.println("Skip to chapter");
		
		deviceState--;
		
	}

	public void buttonSixPressed() {
		
		System.out.println("Return to chapter");
		
		deviceState++;
		
	}
}