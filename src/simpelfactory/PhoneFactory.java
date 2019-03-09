package simpelfactory;

public class PhoneFactory {
	
	public static <T> T getPhoneByBrand(Class<T> clazz){
		try {
			if(clazz != null){
				return clazz.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
