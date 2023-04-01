package criacionais.factoryMethod.app.dbadapter.after.factory;

import criacionais.factoryMethod.app.dbadapter.after.db.DB;
import criacionais.factoryMethod.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
