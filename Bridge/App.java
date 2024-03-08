import Controls.DVDRemote;
import Controls.RemoteButton;
import Controls.TVRemoteMute;
import Controls.TVRemotePause;
import Devices.DVDevice;
import Devices.TVDevice;

public class App {
    public static void main(String[] args) throws Exception {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

		RemoteButton theDvd = new DVDRemote(new DVDevice(1, 200));

		System.out.println("Test TV with Mute");
		
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();
		
		System.out.println("\nTest TV with Pause");
		
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
		
        System.out.println("\nTest DVD");

		theDvd.buttonFivePressed();
		theDvd.buttonSixPressed();
		theDvd.buttonNinePressed();
		theDvd.deviceFeedback();
    }
}
