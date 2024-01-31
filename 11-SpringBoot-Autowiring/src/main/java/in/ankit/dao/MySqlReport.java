package in.ankit.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySqlReport implements ReportDao {

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		return "fething data from my sql db";
	}

}
