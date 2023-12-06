package com.sergiosanpol.forsale.hattrickdata.input.dto;

import org.springframework.util.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@AllArgsConstructor
@Data
public class Players {
	
	@NonNull
	private final String file = "players";
	private final String version = "2.6";
	private final String actionType  = "view";
	private String orderBy;
	private Integer teamID;
	private Boolean includeMatchInfo;
	
	public String getParametres() {
		StringBuilder parametre = new StringBuilder("?");
		
		parametre.append("file=").append(this.file);
		parametre.append("&version=").append(this.version);
		parametre.append("&actionType=").append(this.actionType);
		
		if (StringUtils.hasText(orderBy)) 
			parametre.append("&orderBy=").append(this.orderBy);
		
		if (this.teamID != null && this.teamID > 0)
			parametre.append("&teamID=").append(this.teamID.toString());
		
		if (this.includeMatchInfo != null) 
			parametre.append("&includeMatchInfo=").append(includeMatchInfo);
		
		return parametre.toString();
	}

}
