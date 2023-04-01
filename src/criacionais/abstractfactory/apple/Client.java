package criacionais.abstractfactory.apple;

import criacionais.abstractfactory.apple.factory.IPhone11Factory;
import criacionais.abstractfactory.apple.factory.IPhoneFactory;
import criacionais.abstractfactory.apple.factory.IPhoneXFactory;
import criacionais.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import criacionais.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
