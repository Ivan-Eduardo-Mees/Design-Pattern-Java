package criacionais.factoryMethod.apple.after.factory;


import criacionais.factoryMethod.apple.after.model.IPhone;
import criacionais.factoryMethod.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
