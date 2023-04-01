package criacionais.factoryMethod.apple.after.factory;

import criacionais.factoryMethod.apple.after.model.IPhone;
import criacionais.factoryMethod.apple.after.model.IPhone11;


public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
