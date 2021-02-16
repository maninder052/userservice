package com.user.application.userservice.facade;

import java.util.List;

import com.user.application.userservice.data.ServiceData;
import com.user.application.userservice.data.UserData;

public interface UserFacade {

	public List<UserData> getUserDetails();
	public List<ServiceData> getServiceDetails();
}
