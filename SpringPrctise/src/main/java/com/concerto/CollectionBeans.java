package com.concerto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBeans {
	
	List listAddress;
	Set setAddress;
	Map mapAddress;
	public List getListAddress() {
		System.out.println("in list : " + listAddress);
		return listAddress;
	}
	public void setListAddress(List listAddress) {
		this.listAddress = listAddress;
	}
	public Set getSetAddress() {
		System.out.println("in set : " + setAddress);
		return setAddress;
	}
	public void setSetAddress(Set setAddress) {
		
		this.setAddress = setAddress;
	}
	public Map getMapAddress() {
		System.out.println("in Map map : " + mapAddress);
		return mapAddress;
	}
	public void setMapAddress(Map mapAddress) {
		this.mapAddress = mapAddress;
	}
	
	
	

}
