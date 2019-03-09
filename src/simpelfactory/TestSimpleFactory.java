package simpelfactory;

import simpelfactory.AppleBrand;
import simpelfactory.HuaweiBrand;
import simpelfactory.MilletBrand;
import simpelfactory.Phone;
import simpelfactory.PhoneFactory;

public class TestSimpleFactory {
	
	public static void main(String[] args) {
		AppleBrand appleBrand = new AppleBrand();
		Phone applePhone = PhoneFactory.getPhoneByBrand(appleBrand.getClass());
		applePhone.getPhoneName();
		HuaweiBrand huaweiBrand = new HuaweiBrand();
		Phone huaweiPhone = PhoneFactory.getPhoneByBrand(huaweiBrand.getClass());
		huaweiPhone.getPhoneName();
		MilletBrand milletBrand = new MilletBrand();
		Phone milletPhone = PhoneFactory.getPhoneByBrand(milletBrand.getClass());
		milletPhone.getPhoneName();
	}
}
