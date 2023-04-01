package criacionais.abstractfactory.apple.factory.abstractFactory;

import criacionais.abstractfactory.apple.model.certificate.Certificate;
import criacionais.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
