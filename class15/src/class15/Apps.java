package class15;

public class Apps {
	public static void main(String[] args) {
		productDao pDao= new productDao();
		pDao.save(new product());
		pDao.disconnect();
		pDao.getAll();
		
	}

}
