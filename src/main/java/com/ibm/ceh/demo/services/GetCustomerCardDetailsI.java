package com.ibm.ceh.demo.services;

import com.ibm.ceh.demo.model.GetCustomerCardDetailsRequest;
import javax.ws.rs.core.Response;

public interface GetCustomerCardDetailsI {

    public Response invoke(GetCustomerCardDetailsRequest requestParams);

}
