package com.aibooking.location.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.aibooking.location.response.LocationResponseWrapper;

@Component
public interface LocationService {

  List<LocationResponseWrapper> getLocationList();

}
