package criacionais.abstractfactory.app.service.factory;

import criacionais.abstractfactory.app.service.services.CarEJBService;
import criacionais.abstractfactory.app.service.services.CarService;
import criacionais.abstractfactory.app.service.services.UserEJBService;
import criacionais.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



