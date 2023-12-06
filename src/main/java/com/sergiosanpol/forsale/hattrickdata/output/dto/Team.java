package com.sergiosanpol.forsale.hattrickdata.output.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Team {
	
	private Integer teamID;
	private String teamName;
	private PlayerList playerList;

}
