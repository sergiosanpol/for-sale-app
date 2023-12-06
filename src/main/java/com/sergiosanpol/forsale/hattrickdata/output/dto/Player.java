package com.sergiosanpol.forsale.hattrickdata.output.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Player {
	
	private Integer playerID;
	private String firstName;
	private String nickName;

}
