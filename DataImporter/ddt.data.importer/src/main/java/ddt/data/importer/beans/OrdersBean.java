package ddt.data.importer.beans;

import java.math.BigDecimal;

import com.opencsv.bean.CsvBindByPosition;

public class OrdersBean {
    @CsvBindByPosition(position = 0)
    private int id;
    
    @CsvBindByPosition(position = 1)
    private int leadId;
    
    @CsvBindByPosition(position = 2)
    private BigDecimal unitPrice;
    
    @CsvBindByPosition(position = 3)
    private int quantity;
    
    @CsvBindByPosition(position = 4)
    private BigDecimal shipping;

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
	 * @return the leadId
	 */
	public int getLeadId() {
		return leadId;
	}

	/**
	 * @param leadId the leadId to set
	 */
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the shipping
	 */
	public BigDecimal getShipping() {
		return shipping;
	}

	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

}
