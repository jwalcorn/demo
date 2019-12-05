package com.ibm.ceh.demo.services.impl;
import javax.inject.Inject;
import com.ibm.ceh.demo.logging.LoggingUtilI;  
import com.ibm.ceh.demo.model.GetCardAccountEnquiryRequest;
import com.ibm.ceh.demo.services.GetCardAccountEnquiryI;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.metrics.annotation.Counted;

 
@RequestScoped
public class GetCardAccountEnquiryImpl implements GetCardAccountEnquiryI, FallbackHandler<Response> {

    @Inject
    LoggingUtilI util;
   
    @Override
	 public Response handle(ExecutionContext context){ 
 		 long startTime = util.startLog(GetCardAccountEnquiryImpl.class.getName(), "handle"); 
		 //TODO
		 util.endLog(startTime,GetCardAccountEnquiryImpl.class.getName(), "handle"); 
		 return null;
	 }
	@Override
    @Fallback(GetCardAccountEnquiryImpl.class)
	@Counted
	public Response invoke(GetCardAccountEnquiryRequest requestParams){
   		long startTime = util.startLog(GetCardAccountEnquiryImpl.class.getName(), "invoke");
		//TODO
    	util.endLog(startTime, GetCardAccountEnquiryImpl.class.getName(), "invoke");
		return null;
    }
              
  }
