package com.qa;

//https://mvnrepository.com/artifact/javax.validation/validation-api
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data //@Data has all of the above thats been commented out in one.
@RequiredArgsConstructor
public class Computer {
	private int Id;
	private String brand;
	private String cpu;
	private int RAM;
	private float price;
	private int storage;
	private String OS;
	private String graphicCard;
	private int noOfProc;
	private float weight;
	private int size;
	@NotNull
	private float battery;
	private int noOfPorts;
	private boolean HDMI;
	
	private String resolution;
	private final String typeOfKeyboard="wired";
}
