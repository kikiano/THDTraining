package com.sample.demo.models;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.spanner.core.mapping.Column;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guide {
	@Id
	@PrimaryKey
	@Column
	private int orderNumber;
	@Column
	private List<String> skusTo;
	@Column
	private String location;
	@Column
	private Date date;
	@Column
	private long quantity;
	@Column
	private String status;
	
}
