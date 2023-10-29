package com.aibooking.location.request;

import jakarta.validation.constraints.NotEmpty;

public record LocationRequestWrapper(String vendorId,
    @NotEmpty(message = "name can not be null") String locationName, String description) {

}
