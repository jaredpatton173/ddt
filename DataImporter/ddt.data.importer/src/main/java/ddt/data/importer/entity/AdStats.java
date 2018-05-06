package ddt.data.importer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ad_stats")
@IdClass(CompositeKeyAdStats.class)
public class AdStats {
	
	@Id
	private int id;
	
	@Id
	private Date date;
	
	@Column(name="daily_views")
	private int dailyViews;
	
	public AdStats() {}

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
	
}
