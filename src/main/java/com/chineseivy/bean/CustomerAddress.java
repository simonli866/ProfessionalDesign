package com.chineseivy.bean;

public class CustomerAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customerAddress.addressId
     *
     * @mbg.generated
     */
    private Integer addressid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customerAddress.customerId
     *
     * @mbg.generated
     */
    private Integer customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customerAddress.customerAddress
     *
     * @mbg.generated
     */
    private String customeraddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_customerAddress.defaultAddress
     *
     * @mbg.generated
     */
    private Integer defaultaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customerAddress.addressId
     *
     * @return the value of t_customerAddress.addressId
     *
     * @mbg.generated
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customerAddress.addressId
     *
     * @param addressid the value for t_customerAddress.addressId
     *
     * @mbg.generated
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customerAddress.customerId
     *
     * @return the value of t_customerAddress.customerId
     *
     * @mbg.generated
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customerAddress.customerId
     *
     * @param customerid the value for t_customerAddress.customerId
     *
     * @mbg.generated
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customerAddress.customerAddress
     *
     * @return the value of t_customerAddress.customerAddress
     *
     * @mbg.generated
     */
    public String getCustomeraddress() {
        return customeraddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customerAddress.customerAddress
     *
     * @param customeraddress the value for t_customerAddress.customerAddress
     *
     * @mbg.generated
     */
    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_customerAddress.defaultAddress
     *
     * @return the value of t_customerAddress.defaultAddress
     *
     * @mbg.generated
     */
    public Integer getDefaultaddress() {
        return defaultaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_customerAddress.defaultAddress
     *
     * @param defaultaddress the value for t_customerAddress.defaultAddress
     *
     * @mbg.generated
     */
    public void setDefaultaddress(Integer defaultaddress) {
        this.defaultaddress = defaultaddress;
    }
}