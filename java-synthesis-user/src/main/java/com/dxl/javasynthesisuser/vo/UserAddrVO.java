package com.dxl.javasynthesisuser.vo;

import com.dxl.core.vo.BaseVO;

/**
 * 用户地址VO
 *
 * @author FrozenWatermelon
 * @date 2020-12-07 15:50:02
 */
public class UserAddrVO extends BaseVO {
    private static final long serialVersionUID = 1L;

    private Long addrId;

    private String mobile;

    private Integer isDefault;

    private String consignee;

    private Long provinceId;

    private String province;

    private Long cityId;

    private String city;

    private Long areaId;

    private String area;

    private String postCode;

    private String addr;

    private Double lng;

    private Double lat;

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "UserAddrVO{" +
                "addrId=" + addrId +
                ",createTime=" + createTime +
                ",updateTime=" + updateTime +
                ",mobile=" + mobile +
                ",isDefault=" + isDefault +
                ",consignee=" + consignee +
                ",provinceId=" + provinceId +
                ",province=" + province +
                ",cityId=" + cityId +
                ",city=" + city +
                ",areaId=" + areaId +
                ",area=" + area +
                ",postCode=" + postCode +
                ",addr=" + addr +
                ",lng=" + lng +
                ",lat=" + lat +
                '}';
    }
}
