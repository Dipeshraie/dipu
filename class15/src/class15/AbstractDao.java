package class15;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	@Override
	public void connect() {
	System.out.println("Connected to the database successfully:");
		
	}
@Override
public void disconnect() {
	// TODO Auto-generated method stub
	System.out.println("Disconnected from the database");
	
}

}
