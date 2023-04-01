package criacionais.abstractfactory.app.service.factory;

import criacionais.abstractfactory.app.service.services.CarService;
import criacionais.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
