package com.capgemini.ebs.validation;

public enum ErrorCode {
	INVALID_USERNAME_PASSWORD("Invalid-username or password."),
	MISSING_SECRET_KEY("missing-input-secret"), INVALID_SECRET_KEY("invalid-input-secret"),
	MISSING_USER_CAPTCHA_RESPONSE("missing-input-response"), INVALID_USER_CAPTCHA_RESPONSE("invalid-input-response"),
	BAD_REQUEST("bad-request"), TIMEOUT_OR_DUPLICATE("timeout-or-duplicate"),

	// Custom errors
	MISSING_USERNAME_REQUEST_PARAMETER("missing-username-request-parameter"),
	MISSING_CAPTCHA_RESPONSE_PARAMETER("missing-captcha-response-parameter"),
	VALIDATION_HTTP_ERROR("validation-http-error"), UNSUPPORTED_ERROR_CODE("unsupported_error_code");

	private final String text;

	ErrorCode(String text) {
		this.text = text;
	}

	public String getErrorText() {
		return text;
	}
}
