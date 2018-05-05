package ddt.data.importer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ads")
public class Ad {

	@Id
	private int id;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="daily_views")
	private int dailyViews;
	
	public Ad() {}

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
	 * @return the dailyViews
	 */
	public int getDailyViews() {
		return dailyViews;
	}

	/**
	 * @param dailyViews the dailyViews to set
	 */
	public void setDailyViews(int dailyViews) {
		this.dailyViews = dailyViews;
	}
	
	
}
