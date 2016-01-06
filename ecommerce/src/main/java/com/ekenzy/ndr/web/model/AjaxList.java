package com.ekenzy.ndr.web.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ekenzy.ndr.dao.entities.Zone;

@Component
public class AjaxList {
	
	List<Zone> zones = new ArrayList<Zone>();

	public AjaxList() {
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
	

}
