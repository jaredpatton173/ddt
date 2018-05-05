package ddt.data.importer.beans;

import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class AdStatsBean {

    @CsvBindByPosition(position = 0)
	private int id;
    
    @CsvBindByPosition(position = 1)
    @CsvDate("yyyy-MM-dd")
    private Date date;
    
    @CsvBindByPosition(position = 2)
    private int views;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the views
	 */
	public int getViews() {
		return views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}
}
