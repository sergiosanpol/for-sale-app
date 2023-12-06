package com.sergiosanpol.forsale.hattrickdata.output.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class HattrickData {
	
	@JacksonXmlProperty(localName = "UserSupporterTier")
	private String userSupporterTier;
	@JacksonXmlProperty(localName = "IsYouth")
	private Boolean isYouth;
	@JacksonXmlProperty(localName = "ActionType")
	private String actionType;
	@JacksonXmlProperty(localName = "IsPlayingMatch")
	private Boolean isPlayingMatch;
	//@JacksonXmlProperty(localName = "Team")
	private Team team;
}
