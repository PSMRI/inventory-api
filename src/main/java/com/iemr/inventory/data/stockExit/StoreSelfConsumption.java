/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.inventory.data.stockExit;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.iemr.inventory.utils.mapper.OutputMapper;

import lombok.Data;

@Entity
@Table(name="t_facilityconsumption")
@Data
public class StoreSelfConsumption {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Expose
	@Column(name="ConsumptionID")
	private Long consumptionID;
		
	@Expose
	@Column(name="VanSerialNo")
	private Long vanSerialNo;
	
	@Expose
	@Column(name="FacilityID")
	private Integer facilityID;
	
	@Expose
	@Column(name="SyncFacilityID")
	private Integer syncFacilityID;
	
	@Expose
	@Column(name="VanID")
	private Long vanID;
	
	@Expose
	@Column(name="ParkingPlaceID")
	private Long parkingPlaceID;
	
	
	@Expose
	@Column(name="RefNo")
	private String refNo;
	
	@Expose
	@Column(name="Reason")
	private String reason;
	
	@Transient
	@Expose
	private List<ItemStockExit>  itemStockExit;

	
	@Expose
	@Column(name="Deleted", insertable = false, updatable = true)
	private Boolean deleted;
	
	@Expose
	@Column(name="Processed", insertable = false, updatable = true)
	private Character processed;
	
	@Expose
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Expose
	@Column(name="CreatedDate", insertable = false, updatable = false)
	private Date createdDate;
	
	@Expose
	@Column(name="ModifiedBy")
	private String modifiedBy;
	
	@Expose
	@Column(name="LastModDate", insertable = false, updatable = false)
	private Date lastModDate;
	
	@Transient
	private OutputMapper outputMapper = new OutputMapper();

	@Override
	public String toString() {
		return outputMapper.gson().toJson(this);
	}

	public List<ItemStockExit> getItemStockExit() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCreatedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getFacilityID() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getVanID() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getParkingPlaceID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSyncFacilityID(Integer facilityID2) {
		// TODO Auto-generated method stub
		
	}

	public Long getConsumptionID() {
		// TODO Auto-generated method stub
		return null;
	}

}
