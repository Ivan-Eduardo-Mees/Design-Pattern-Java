package criacionais.factoryMethod.apple.after.factory;

import criacionais.factoryMethod.apple.after.model.IPhone;
import criacionais.factoryMethod.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
