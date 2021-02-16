package com.user.application.userservice.facade.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.application.userservice.DTO.ServiceRequestDTO;
import com.user.application.userservice.data.ServiceData;
import com.user.application.userservice.data.UserData;
import com.user.application.userservice.facade.UserFacade;
import com.user.application.userservice.facade.UserServiceFacade;
import com.user.application.userservice.models.ServiceModel;
import com.user.application.userservice.models.UserModel;
import com.user.application.userservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceFacadeImpl implements UserServiceFacade {
	
	@Autowired
	private UserServices userService;

	@Override
	public void generateRequest(ServiceRequestDTO service) {
		final boolean isUserValid=validateUser(service);
if(isUserValid) {
	
}
		
	}

	private boolean validateUser(ServiceRequestDTO serviceRequest) {
		if(Objects.nonNull(serviceRequest) && Objects.nonNull(serviceRequest.getUserId())) {
			return userService.isValidUser(serviceRequest.getUserId());
		}
		return false;
	}
	
}
