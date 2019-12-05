package com.ibm.ceh.demo.services;

import com.ibm.ceh.demo.model.UpdateDirectDebitsRequest;
import javax.ws.rs.core.Response;

public interface UpdateDirectDebitsI {

    public Response invoke(UpdateDirectDebitsRequest requestParams);

}
