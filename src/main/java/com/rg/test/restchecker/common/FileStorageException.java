package com.rg.test.restchecker.common;

public class FileStorageException extends RuntimeException {
	private static final long serialVersionUID = -3697920445515919030L;

	public FileStorageException(String message) {
		super(message);
	}

	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
	}
}