package com.ibm.ceh.demo.services;

import com.ibm.ceh.demo.model.CreateCardTransactionRequest;
import javax.ws.rs.core.Response;

public interface CreateCardTransactionI {

    public Response invoke(CreateCardTransactionRequest requestParams);

}
