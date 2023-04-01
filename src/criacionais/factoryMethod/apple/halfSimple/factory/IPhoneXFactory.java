package criacionais.factoryMethod.apple.halfSimple.factory;

import criacionais.factoryMethod.apple.halfSimple.model.IPhone;
import criacionais.factoryMethod.apple.halfSimple.model.IPhoneX;
import criacionais.factoryMethod.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
