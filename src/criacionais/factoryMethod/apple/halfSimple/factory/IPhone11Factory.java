package criacionais.factoryMethod.apple.halfSimple.factory;

import criacionais.factoryMethod.apple.halfSimple.model.IPhone;
import criacionais.factoryMethod.apple.halfSimple.model.IPhone11;
import criacionais.factoryMethod.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
