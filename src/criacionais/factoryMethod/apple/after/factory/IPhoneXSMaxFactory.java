package criacionais.factoryMethod.apple.after.factory;


import criacionais.factoryMethod.apple.after.model.IPhone;
import criacionais.factoryMethod.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
