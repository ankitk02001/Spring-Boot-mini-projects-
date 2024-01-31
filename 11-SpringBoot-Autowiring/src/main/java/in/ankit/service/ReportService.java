package in.ankit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ankit.dao.ReportDao;

@Service
public class ReportService {
	@Autowired
	@Qualifier("oracle")
	private ReportDao reportDao;
	
	public void generateReport() {
		String data = reportDao.findData();
		System.out.println(data);
	}
	
	

}
