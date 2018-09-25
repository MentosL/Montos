package com.montos.common.response;

/**
 * rpc response
 * 
 * @author montos
 *
 */
public class RpcResponse {

	private String requestId;

	private Exception exception;

	private Object result;

	public boolean hasException() {
		return exception != null;
	}

	public String getRequestId() {
		return requestId;
	}

	public RpcResponse setRequestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	public Exception getException() {
		return exception;
	}

	public RpcResponse setException(Exception exception) {
		this.exception = exception;
		return this;
	}

	public Object getResult() {
		return result;
	}

	public RpcResponse setResult(Object result) {
		this.result = result;
		return this;
	}

}
