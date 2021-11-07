package com.esms.ms;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;

@Container(containerName = "products")
@Data
public class Product {

    @Id
    private String productid;

    private String productName;

    private double price;

    @PartitionKey
    private String productCategory;
}
