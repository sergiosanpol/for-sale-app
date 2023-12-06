package com.sergiosanpol.forsale.hattrickdata.input.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@AllArgsConstructor
@Data
public class TransferSearch {
	
	private final String file = "transfersearch";
	private final String version = "1.1";
	@NonNull
	private Integer ageMin;
	private Integer ageDaysMin;

}
