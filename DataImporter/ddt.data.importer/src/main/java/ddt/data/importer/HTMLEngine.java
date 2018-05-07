package ddt.data.importer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import ddt.data.importer.dao.ReportDAO;
import ddt.data.importer.entity.AdsReport;

public class HTMLEngine {

	private ReportDAO dao = new ReportDAO();

	public HTMLEngine() {
		List<AdsReport> rows = dao.generateAllTimeReport();
		List<String> headers = Arrays.asList("Ad Id", "All-time Total Views", "All-time CTR %", "All-time Conv %", "All-time Total Revenue",
				"All-time Average Customer Age", "All-time Best State (most conversions)", "All-time Worst State (least conversions)");

		String html = "<html>\n" + 
				"<header><title>Ad Report</title></header>\n" + 
				"<body>\n" +
				"<table rules=\"all\">"
				+ "<tr>";
		for(String h : headers) {
			html += "<th>" + h + "</th>";
		}
		
		for (AdsReport r : rows) {
			html += "<tr>";
			html += "<td>"+String.valueOf(r.getId())+"</td>";
			html += "<td>"+String.valueOf(r.getTotalViews())+"</td>";
			html += "<td>"+String.valueOf(r.getCtrPercentage())+"</td>";
			html += "<td>"+String.valueOf(r.getConversionRatePercentage())+"</td>";
			html += "<td>"+String.valueOf(r.getTotalRevenue())+"</td>";
			html += "<td>"+String.valueOf(r.getAverageCustomerAge())+"</td>";
			html += "<td>"+String.valueOf(r.getBestState())+"</td>";
			html += "<td>"+String.valueOf(r.getWorstState())+"</td>";
			
			

		}

		html += "</table></body></html>";

		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(ArgumentEngine.directory));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			out.write(html);
		}
		catch (IOException e)
		{
			System.out.println("Exception ");
		}
		finally
		{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 *     Ad ID
    All-time Total Views
    All-time Click Through Rate %
    All-time Conversion Rate %
    All-time Total revenue
    All-time Average Customer Age (for leads that clicked the ad)
    All-time Best State (State with the most conversions)
    All-time Worst State (State with the least conversions)
		 */
		/**
		 * div(attrs("#employees"),
        p("Some sibling element"),
        each(employees, employee ->
            div(attrs(".employee"),
                h2(employee.getName()),
                img().withSrc(employee.getImgPath()),
                p(employee.getTitle())
            )
        )
    )
		 */
	}
}
