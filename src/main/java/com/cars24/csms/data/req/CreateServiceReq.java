package com.cars24.csms.data.req;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
//import javax.validation.Valid;
//import javax.validation.constraints.*;

@Valid
@Data  //getter setter tostring
public class CreateServiceReq extends BaseServiceReq{

    @Valid
    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private double price;


    }
