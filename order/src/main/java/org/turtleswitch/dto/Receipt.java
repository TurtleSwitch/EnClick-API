package org.turtleswitch.dto;

import lombok.Data;
import org.turtleswitch.model.OptionDtl;
import org.turtleswitch.model.Product;

@Data
public class Receipt {
    private Product product;
    private int productNumber;
    private OptionDtl optionDtl;
    private int optionDtlNumber;
}
