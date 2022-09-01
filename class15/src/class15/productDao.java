package class15;

import java.util.ArrayList;

public class productDao<T> extends AbstractDao<product> {

	@Override
	public int save(product t) {
		System.out.println("Product added to the database:");
		return 0;
	}

	@Override
	public product getOne(int id) {
	System.out.println("the product is pen:");
		return null;
	}

	@Override
	public ArrayList<product> getAll() {
		System.out.println("All he produc read from daabase:");
		return null;
	}

	@Override
	public int update(product t) {
		System.out.println("Product updated from database:");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("Product deleated from database:");
		return 0;
	}

}
