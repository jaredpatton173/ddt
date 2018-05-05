package ddt.data.importer.beans;

import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class LeadsBean {
    @CsvBindByPosition(position = 0)
    private int id;
    
    @CsvBindByPosition(position = 1)
    @CsvDate("yyyy-MM-dd")
    private Date dateOfBirth;
    
    @CsvBindByPosition(position = 2)
    private int adId;
    
    @CsvBindByPosition(position = 3)
    private String state;
    
    @CsvBindByPosition(position = 4)
    @CsvDate("yyyy-MM-dd hh:mm:ss")
    private Date createdAt;

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
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the adId
	 */
	public int getAdId() {
		return adId;
	}

	/**
	 * @param adId the adId to set
	 */
	public void setAdId(int adId) {
		this.adId = adId;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
