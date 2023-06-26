package com.dxl.javasynthesisuser.vo;


/**
 * @author FrozenWatermelon
 * @date 2021/2/25
 */
public class UserSimpleInfoVO {

    private String nickName;

    private String pic;

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

    @Override
    public String toString() {
        return "UserCenterInfoVO{" +
                "nickName='" + nickName + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
