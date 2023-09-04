package com.inventory.requestVM.ProductRequest;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateProductRequest {
	private Integer id;

	private String productName;
	
	private Integer viewCount;
	
	private String seoAlias;
	
	private Boolean isStatus;
	
	private Boolean delStatus;
	
	private List<CreateProductDetailRequest> productDetails;

}
