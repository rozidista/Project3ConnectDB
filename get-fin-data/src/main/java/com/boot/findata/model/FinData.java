package com.boot.findata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "tams_fin_feed_master_id")
public class FinData {
	
	@Id
	private String finId;
	
	private String name;
	
	private String id_number;
	
	private String fin_level;

	public String getFinId() {
		return finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return id_number;
	}

	public void setIdNum(String idNum) {
		this.id_number = idNum;
	}

	public String getFinLvl() {
		return fin_level;
	}

	public void setFinLvl(String finlvl) {
		this.fin_level = finlvl;
	}
	
}
