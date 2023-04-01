package criacionais.factoryMethod.app.dbadapter.after.factory;

import criacionais.factoryMethod.app.dbadapter.after.db.DB;
import criacionais.factoryMethod.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
