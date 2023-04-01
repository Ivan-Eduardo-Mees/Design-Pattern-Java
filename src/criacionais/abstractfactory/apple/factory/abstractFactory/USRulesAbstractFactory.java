package criacionais.abstractfactory.apple.factory.abstractFactory;

import criacionais.abstractfactory.apple.model.certificate.Certificate;
import criacionais.abstractfactory.apple.model.certificate.USCertificate;
import criacionais.abstractfactory.apple.model.packing.Packing;
import criacionais.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
