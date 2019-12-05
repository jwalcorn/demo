package com.ibm.ceh.demo.services.impl;
import javax.inject.Inject;
import com.ibm.ceh.demo.logging.LoggingUtilI;  
import com.ibm.ceh.demo.model.UpdateDirectDebitsRequest;
import com.ibm.ceh.demo.services.UpdateDirectDebitsI;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.metrics.annotation.Counted;

 
@RequestScoped
public class UpdateDirectDebitsImpl implements UpdateDirectDebitsI, FallbackHandler<Response> {

    @Inject
    LoggingUtilI util;
   
    @Override
	 public Response handle(ExecutionContext context){ 
 		 long startTime = util.startLog(UpdateDirectDebitsImpl.class.getName(), "handle"); 
		 //TODO
		 util.endLog(startTime,UpdateDirectDebitsImpl.class.getName(), "handle"); 
		 return null;
	 }
	@Override
    @Fallback(UpdateDirectDebitsImpl.class)
	@Counted
	public Response invoke(UpdateDirectDebitsRequest requestParams){
   		long startTime = util.startLog(UpdateDirectDebitsImpl.class.getName(), "invoke");
		//TODO
    	util.endLog(startTime, UpdateDirectDebitsImpl.class.getName(), "invoke");
		return null;
    }
              
  }
