package ddt.data.importer.entity;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class CompositeKeyAdStats implements Serializable {
	private int id;
	private Date date;

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

}
