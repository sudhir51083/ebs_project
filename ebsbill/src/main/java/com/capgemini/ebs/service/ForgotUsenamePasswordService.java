package com.capgemini.ebs.service;

import com.capgemini.ebs.dto.ForgotUserNamePass;
import com.capgemini.ebs.dto.Response;

public interface ForgotUsenamePasswordService {

	Response resetUserNamePassword(ForgotUserNamePass forgotUserNamePass);

}
