package com.ibm.ceh.demo.services.impl;
import javax.inject.Inject;
import com.ibm.ceh.demo.logging.LoggingUtilI;  
import com.ibm.ceh.demo.model.GetCustomerCardDetailsRequest;
import com.ibm.ceh.demo.services.GetCustomerCardDetailsI;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.metrics.annotation.Counted;

 
@RequestScoped
public class GetCustomerCardDetailsImpl implements GetCustomerCardDetailsI, FallbackHandler<Response> {

    @Inject
    LoggingUtilI util;
   
    @Override
	 public Response handle(ExecutionContext context){ 
 		 long startTime = util.startLog(GetCustomerCardDetailsImpl.class.getName(), "handle"); 
		 //TODO
		 util.endLog(startTime,GetCustomerCardDetailsImpl.class.getName(), "handle"); 
		 return null;
	 }
	@Override
    @Fallback(GetCustomerCardDetailsImpl.class)
	@Counted
	public Response invoke(GetCustomerCardDetailsRequest requestParams){
   		long startTime = util.startLog(GetCustomerCardDetailsImpl.class.getName(), "invoke");
		//TODO
    	util.endLog(startTime, GetCustomerCardDetailsImpl.class.getName(), "invoke");
		return null;
    }
              
  }
