package com.aibooking.location.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {

  @Id
  String locationId;

  String serviceId;

  String locationName;

  String address;

  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


}
