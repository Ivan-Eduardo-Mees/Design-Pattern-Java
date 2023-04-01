package criacionais.abstractfactory.apple.factory.abstractFactory;

import criacionais.abstractfactory.apple.model.certificate.BrazilianCertificate;
import criacionais.abstractfactory.apple.model.certificate.Certificate;
import criacionais.abstractfactory.apple.model.packing.BrazilianPacking;
import criacionais.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
