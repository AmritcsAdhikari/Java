import java.util.Random;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioMessage {

	public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static String CODETOSEND = "";

	public static String randomNum() {
		Random rand = new Random();
		int num = rand.nextInt(10000) + 21136;
		String twilioCode = String.valueOf(num);
		return twilioCode;
	}

	public static void sendMessage(String PHONE) {
		CODETOSEND = randomNum();

		System.out.println("Codetosend" + CODETOSEND);
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message.creator(new PhoneNumber(PHONE), new PhoneNumber("+18152205663"),
				"Plese Enter the CODE to log into the system: " + CODETOSEND).create();

	}
}
