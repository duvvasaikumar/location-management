package com.aibooking.location.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.aibooking.location.domain.Location;
import com.aibooking.location.repository.LocationRepository;
import com.aibooking.location.response.LocationResponseWrapper;

@Component
public class LocationServiceImpl implements LocationService {


  LocationRepository locationRepository;

  LocationServiceImpl(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;

  }


  @Override
  public List<LocationResponseWrapper> getLocationList() {

    List<Location> locations = locationRepository.findAll();

    return locations.stream().map(location -> {

      LocationResponseWrapper locationResponse = new LocationResponseWrapper(
          location.getLocationId(), location.getLocationName(), location.getAddress());
      return locationResponse;
    }).collect(Collectors.toList());


  }

}
