package criacionais.factoryMethod.apple.simple.factory;

import criacionais.factoryMethod.apple.simple.model.*;

public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(IphoneGenerationEnum generation, IphoneLevelEnum level) {
		IPhone device = null;

		//USING ENUM
		switch (generation){
			case X:
				switch (level){
					case STANDARD:
						device = new IPhoneX();
						break;
					case HIGHEND:
						device = new IPhoneXSMax();
				}
			case ONZE:
				switch (level){
					case STANDARD:
						device = new IPhone11();
						break;
					case HIGHEND:
						device = new IPhone11Pro();
				}
		}
		//USING STRING
//		if (generation.equals("X")) {
//			if (level.equals("standard")) {
//				device = new IPhoneX();
//			} else if (level.equals("highEnd")) {
//				device = new IPhoneXSMax();
//			}
//		} else if (generation.equals("11")) {
//			if (level.equals("standard")) {
//				device = new IPhone11();
//			} else if (level.equals("highEnd")) {
//				device = new IPhone11Pro();
//			}
//		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
