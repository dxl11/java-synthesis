package com.dxl.javasynthesisuser.vo;

import com.dxl.core.serializer.ImgJsonSerializer;
import com.dxl.core.vo.BaseVO;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * 用户表VO
 *
 * @author YXF
 * @date 2020-12-08 11:18:04
 */
public class UserApiVO extends BaseVO {
    private static final long serialVersionUID = 1L;

    private Long userId;

    private String nickName;

    @JsonSerialize(using = ImgJsonSerializer.class)
    private String pic;

    private Integer status;

    /**
     * openId list
     */
    private List<String> bizUserIdList;

    public List<String> getBizUserIdList() {
        return bizUserIdList;
    }

    public void setBizUserIdList(List<String> bizUserIdList) {
        this.bizUserIdList = bizUserIdList;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserApiVO{" +
                "userId=" + userId +
                ",createTime=" + createTime +
                ",updateTime=" + updateTime +
                ",nickName=" + nickName +
                ",pic=" + pic +
                ",status=" + status +
                '}';
    }
}
