package com.ibm.ceh.demo.services;

import com.ibm.ceh.demo.model.GetCardAccountEnquiryRequest;
import javax.ws.rs.core.Response;

public interface GetCardAccountEnquiryI {

    public Response invoke(GetCardAccountEnquiryRequest requestParams);

}
