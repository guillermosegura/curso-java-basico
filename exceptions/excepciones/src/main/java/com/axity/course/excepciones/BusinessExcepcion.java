package com.axity.course.excepciones;

public class BusinessExcepcion extends RuntimeException {

	private static final long serialVersionUID = 8389119791244900216L;
	private BusinessExcepcionCode code;
	private Module module;
	private String uuid;

	public BusinessExcepcion() {
		super();
	}

	public BusinessExcepcion(String message) {
		super(message);
	}

	public BusinessExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessExcepcion(Throwable cause) {
		super(cause);
	}

	public BusinessExcepcionCode getCode() {
		return code;
	}

	public void setCode(BusinessExcepcionCode code) {
		this.code = code;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
