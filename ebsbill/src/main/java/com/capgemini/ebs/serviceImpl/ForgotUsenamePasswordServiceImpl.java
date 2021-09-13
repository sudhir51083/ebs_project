package com.capgemini.ebs.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.dto.ForgotUserNamePass;
import com.capgemini.ebs.dto.Mail;
import com.capgemini.ebs.dto.Response;
import com.capgemini.ebs.repository.RegistrationRepository;
import com.capgemini.ebs.service.ForgotUsenamePasswordService;
import com.capgemini.ebs.service.MailService;

@Service
public class ForgotUsenamePasswordServiceImpl implements ForgotUsenamePasswordService {
	@Autowired
	private RegistrationRepository registrationRepository;
	@Autowired
	private MailService mailService;

	@Override
	public Response resetUserNamePassword(ForgotUserNamePass forgotUserNamePass) {
		Response response = new com.capgemini.ebs.dto.Response();
		String message = "No record found.";
		boolean status = false;
		if (forgotUserNamePass.getType().equals("forgotUserName")) {
			boolean isExistsEmail = registrationRepository.existsByEmailId(forgotUserNamePass.getRegisteredEmail());
			boolean isExistsMobile = registrationRepository
					.existsByMobileNumber(forgotUserNamePass.getRegisteredMobile());
			// boolean isExistUser =
			// registrationRepository.existsById(forgotUserNamePass.getRegisteredMobile());
			message = "Registered EmailId or Mobile number not found.";
			status = false;
			if (isExistsEmail && isExistsMobile) {
				message = "New User Name is sent to your registered EmailId and Mobile number.";
				status = true;
			}
			System.out.println(isExistsEmail + " " + isExistsMobile);
			// return response;
		} else if (forgotUserNamePass.getType().equals("forgotPassword")) {
			boolean isExistsEmail = registrationRepository.existsByEmailId(forgotUserNamePass.getRegisteredEmail());
			boolean isExistsMobile = registrationRepository
					.existsByMobileNumber(forgotUserNamePass.getRegisteredMobile());
			boolean isExistUser = registrationRepository.existsByUserId(forgotUserNamePass.getLoginName());
			message = "Login Name or Registered EmailId or Mobile number not found.";
			status = false;
			if (isExistsEmail && isExistsMobile && isExistUser) {
				message = "New password is sent to your registered EmailId and Mobile number.";
				status = true;
			}
			System.out.println(isExistsEmail + " " + isExistsMobile + " " + isExistUser);
			// return response;
		}
		if(status) {
			testEmail(forgotUserNamePass.getRegisteredEmail());
		}
		/*
		 * else { response.setMessage("No type found."); response.setStatus(false);
		 * return response; }
		 */
		response.setMessage(message);
		response.setStatus(status);
		return response;
		// return response;
	}

	private void testEmail(String emailId) {
		Mail mail = new Mail();
		mail.setMailFrom("sudhir51083@gmail.com");
		mail.setMailTo("sudhir51083@gmail.com");
		mail.setMailSubject("Spring Boot - Email Example");
		mail.setMailContent("EBS mail testing!!!"
				+ "\n\nThanks\n"
				+ "www.ebs.com");
		mailService.sendEmail(mail);
		return;
	}

}
