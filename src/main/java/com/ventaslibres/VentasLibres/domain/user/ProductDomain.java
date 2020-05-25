package com.ventaslibres.VentasLibres.domain.user;

public class ProductDomain {

    String productId;
    String producName;
    int priceProduct;

    public ProductDomain(String productId, String producName, int priceProduct) {
        this.productId = productId;
        this.producName = producName;
        this.priceProduct = priceProduct;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public ProductDomain() {

    }

    @Override
    public String toString() {
        return "ProductDomain{" +
                "productId='" + productId + '\'' +
                ", producName='" + producName + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
