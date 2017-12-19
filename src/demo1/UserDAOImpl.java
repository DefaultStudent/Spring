package demo1;

import org.springframework.stereotype.Repository;

/**
 * UserDAOImpl交给IoC容器
 * @author vodka
 */

@Repository(value="usersDAO")
public class UserDAOImpl implements UsersDAO {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存客户...");

	}

}
