package aula4.interfacebanco;

public class DriverPostgreSql implements DriverBancoDados {

	public int update(String updateSql) {
		System.out.println("Executando comando no postgres");
		System.out.println(updateSql);
		return 0;
	}

	public void insertInto(String insertIntoSql) {
		System.out.println("Executando comando no postgres");
		System.out.println(insertIntoSql);
		
	}

}
