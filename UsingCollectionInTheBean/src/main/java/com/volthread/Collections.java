package com.volthread;

import java.util.*;


public class Collections {
	List<?> addressList;
	Set<?>  addressSet;
	Map<?, ?>  addressMap;
	Properties addressProp;

	   public void setAddressList(List<?> addressList) {
	      this.addressList = addressList;
	   }
	   public void setAddressSet(Set<?> addressSet) {
		      this.addressSet = addressSet;
		   }
	   public void setAddressMap(Map<?, ?> addressMap) {
		      this.addressMap = addressMap;
		   }	   
	   public void setAddressProp(Properties addressProp) {
		      this.addressProp = addressProp;
		   }
	   
	   public List<?> getAddressList() {
	      System.out.println("List Elements :"  + addressList);
	      return addressList;
	   }
	   
	   public Set<?> getAddressSet() {
	      System.out.println("Set Elements :"  + addressSet);
	      return addressSet;
	   }	    
	   
	   public Map<?, ?> getAddressMap() {
	      System.out.println("Map Elements :"  + addressMap);
	      return addressMap;
	   }	   	
	   
	   public Properties getAddressProp() {
	      System.out.println("Property Elements :"  + addressProp);
	      return addressProp;
	   }
}
