package com.aibooking.location.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aibooking.location.error.InvalidRequestArgumentException;
import com.aibooking.location.request.LocationRequestWrapper;
import com.aibooking.location.response.LocationResponseWrapper;
import com.aibooking.location.service.LocationService;

@RestController
@RequestMapping("/locationService")
public class LocationController {


  private static final Logger logger = LoggerFactory.getLogger(LocationController.class);

  LocationService locationService;



  LocationController(LocationService locationService) {
    this.locationService = locationService;

  }

  @GetMapping("/locations")
  ResponseEntity<List<LocationResponseWrapper>> getVendors() {

    logger.info("Get all locations ");

    List<LocationResponseWrapper> responseList = locationService.getLocationList();

    return new ResponseEntity<List<LocationResponseWrapper>>(responseList, HttpStatus.OK);

  }

  @PostMapping("/location")
  ResponseEntity<LocationResponseWrapper> createVendor(
      @RequestBody @Validated LocationRequestWrapper locationRequestWrapper,
      BindingResult bindingResult) {

    logger.info("Create location request for vendor {} ", locationRequestWrapper.locationName());

    if (bindingResult.hasErrors()) {
      throw new InvalidRequestArgumentException();
    }

    LocationResponseWrapper response = new LocationResponseWrapper("123", "location", "desc");

    return new ResponseEntity<LocationResponseWrapper>(response, HttpStatus.CREATED);

  }

}
