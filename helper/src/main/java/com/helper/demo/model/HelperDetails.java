package com.helper.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelperDetails {
	@Id
    private int helperId;
    private String helperService;
    private String location;
    private String description;
    private String helperPassword;
	private String pan;
	private String aadhar;
	@OneToOne
	private UserDetails userDetails;
    
}
