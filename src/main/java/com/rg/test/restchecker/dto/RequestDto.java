package com.rg.test.restchecker.dto;

public class RequestDto {
	private String corpName;

	@Override
	public String toString() {
		return "RequestDto [corpName=" + corpName + "]";
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
}
