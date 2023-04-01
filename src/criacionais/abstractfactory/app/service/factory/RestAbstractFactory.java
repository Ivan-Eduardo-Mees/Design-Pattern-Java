package criacionais.abstractfactory.app.service.factory;

import criacionais.abstractfactory.app.service.services.CarRestApiService;
import criacionais.abstractfactory.app.service.services.CarService;
import criacionais.abstractfactory.app.service.services.UserRestApiService;
import criacionais.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
