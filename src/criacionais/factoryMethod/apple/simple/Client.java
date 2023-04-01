package criacionais.factoryMethod.apple.simple;

import criacionais.factoryMethod.apple.simple.factory.IPhoneSimpleFactory;
import criacionais.factoryMethod.apple.simple.model.IPhone;
import criacionais.factoryMethod.apple.simple.model.IphoneGenerationEnum;
import criacionais.factoryMethod.apple.simple.model.IphoneLevelEnum;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone(IphoneGenerationEnum.X, IphoneLevelEnum.STANDARD);
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone(IphoneGenerationEnum.ONZE, IphoneLevelEnum.HIGHEND);
		System.out.println(iphone2);
	}
}
