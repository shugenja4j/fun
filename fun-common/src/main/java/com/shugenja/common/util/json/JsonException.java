package com.shugenja.common.util.json;

public class JsonException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public JsonException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonException(String message) {
		super(message);
	}

	public JsonException(Throwable cause) {
		super(cause);
	}

}
