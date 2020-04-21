package com.kong.mybatis.model;

import java.io.Serializable;

public class Cat implements Serializable {
    private Integer pkCat;

    private String catName;

    private String address;

    private String createBy;

    private static final long serialVersionUID = 1L;

    public Integer getPkCat() {
        return pkCat;
    }

    public void setPkCat(Integer pkCat) {
        this.pkCat = pkCat;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkCat=").append(pkCat);
        sb.append(", catName=").append(catName);
        sb.append(", address=").append(address);
        sb.append(", createBy=").append(createBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}