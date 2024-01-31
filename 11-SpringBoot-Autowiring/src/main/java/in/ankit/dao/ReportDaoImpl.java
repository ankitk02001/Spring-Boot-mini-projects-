package in.ankit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
public class ReportDaoImpl implements ReportDao {
	public ReportDaoImpl() {
		super();
		System.out.println("ReportDaoImpl Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String findData() {
		// TODO Auto-generated method stub
		return "Report Data from oracle";
	}

}
