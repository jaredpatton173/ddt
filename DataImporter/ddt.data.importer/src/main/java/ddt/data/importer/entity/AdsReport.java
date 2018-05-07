package ddt.data.importer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_ads_report")
public class AdsReport {
	
	@Id
	private Ad id;

}
