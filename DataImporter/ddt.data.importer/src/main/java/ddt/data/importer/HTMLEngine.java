package ddt.data.importer;

import java.util.List;

import ddt.data.importer.dao.ReportDAO;
import ddt.data.importer.entity.AdsReport;

public class HTMLEngine {

	private ReportDAO dao = new ReportDAO();
	
	public HTMLEngine() {
		List<AdsReport> rows = dao.generateAllTimeReport();
		
	}
}
