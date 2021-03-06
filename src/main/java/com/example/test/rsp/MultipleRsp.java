package com.example.test.rsp;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultipleRsp extends BaseRsp {
	// region -- Fields --

	@JsonProperty(value = "result")
	private Map<String, Object> result;

	// end

	// region -- Get set --

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	// end

	// region -- Methods --

	public MultipleRsp() {
	}

	public MultipleRsp(String status, String message, Map<String, Object> result) {
		super(status, message);
		this.result = result;
	}

	// end
}