package br.com.uol.selecao.dto;

import java.util.Arrays;

public class RestResponse {
	private String[] messages;
	private IpVigilanteDTO result;

	public RestResponse() {
	}

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	public IpVigilanteDTO getResult() {
		return result;
	}

	public void setResult(IpVigilanteDTO result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RestResponse [messages=" + Arrays.toString(messages)
				+ ", result=" + result + "]";
	}
}