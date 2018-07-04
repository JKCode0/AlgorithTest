package log;

public class TLog {

	public static int nType = 1;
	public static boolean Enable = true;
	
	public static void Log(String str) {
		Log(1, str);
	}
	
	
	public static void Log(int type, String str) {
		if(!Enable ) {
			return;
		}
		
		//
		if( (type&nType) == type) {
			System.out.println("["+ type + "]" + str);
		}
	}
	
}
