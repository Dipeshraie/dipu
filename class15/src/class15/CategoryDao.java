package class15;

import java.util.ArrayList;

public class CategoryDao<T> extends AbstractDao<category>  {
	@Override
	public int save(category t) {
		System.out.println("category added to the database:");
		return 0;
	}

	@Override
	public category getOne(int id) {
	System.out.println("the category is pen:");
		return null;
	}

	@Override
	public ArrayList<category> getAll() {
		System.out.println("All he produc read from daabase:");
		return null;
	}

	@Override
	public int update(category t) {
		System.out.println("category updated from database:");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("category deleated from database:");
		return 0;
	}

}
