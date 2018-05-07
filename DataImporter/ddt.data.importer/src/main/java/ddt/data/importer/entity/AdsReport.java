package ddt.data.importer.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_ads_report")
public class AdsReport {
	
	@Id
	private int id;
	
	@Column(name = "total_views")
	private int totalViews;
	
	@Column(name = "ctr_percentage")
	private BigDecimal ctrPercentage;
	
	@Column(name = "conversion_rate_percentage")
	private BigDecimal conversionRatePercentage;
	
	@Column(name = "total_revenue")
	private BigDecimal totalRevenue;
	
	@Column(name = "average_customer_age")
	private double averageCustomerAge;
	
	@Column(name = "best_state")
	private String bestState;
	
	@Column(name = "worst_state")
	private String worstState;
	
	public AdsReport() {}
	
	public AdsReport(int id, int totalViews, BigDecimal ctrPercentage, 
			BigDecimal conversionRatePercentage, BigDecimal totalRevenue, 
			double averageCustomerAge, String bestState, String worstState) {
		this.id = id;
		this.totalViews = totalViews;
		this.ctrPercentage = ctrPercentage;
		this.conversionRatePercentage = conversionRatePercentage;
		this.totalRevenue = totalRevenue;
		this.averageCustomerAge = averageCustomerAge;
		this.bestState = bestState;
		this.worstState = worstState;
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

	/**
	 * @return the totalViews
	 */
	public int getTotalViews() {
		return totalViews;
	}

	/**
	 * @param totalViews the totalViews to set
	 */
	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}

	/**
	 * @return the ctrPercentage
	 */
	public BigDecimal getCtrPercentage() {
		return ctrPercentage;
	}

	/**
	 * @param ctrPercentage the ctrPercentage to set
	 */
	public void setCtrPercentage(BigDecimal ctrPercentage) {
		this.ctrPercentage = ctrPercentage;
	}

	/**
	 * @return the conversionRatePercentage
	 */
	public BigDecimal getConversionRatePercentage() {
		return conversionRatePercentage;
	}

	/**
	 * @param conversionRatePercentage the conversionRatePercentage to set
	 */
	public void setConversionRatePercentage(BigDecimal conversionRatePercentage) {
		this.conversionRatePercentage = conversionRatePercentage;
	}

	/**
	 * @return the totalRevenue
	 */
	public BigDecimal getTotalRevenue() {
		return totalRevenue;
	}

	/**
	 * @param totalRevenue the totalRevenue to set
	 */
	public void setTotalRevenue(BigDecimal totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	/**
	 * @return the averageCustomerAge
	 */
	public double getAverageCustomerAge() {
		return averageCustomerAge;
	}

	/**
	 * @param averageCustomerAge the averageCustomerAge to set
	 */
	public void setAverageCustomerAge(double averageCustomerAge) {
		this.averageCustomerAge = averageCustomerAge;
	}

	/**
	 * @return the bestState
	 */
	public String getBestState() {
		return bestState;
	}

	/**
	 * @param bestState the bestState to set
	 */
	public void setBestState(String bestState) {
		this.bestState = bestState;
	}

	/**
	 * @return the worstState
	 */
	public String getWorstState() {
		return worstState;
	}

	/**
	 * @param worstState the worstState to set
	 */
	public void setWorstState(String worstState) {
		this.worstState = worstState;
	}

}
