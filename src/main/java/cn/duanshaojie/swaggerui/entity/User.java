package cn.duanshaojie.swaggerui.entity;

import java.io.Serializable;

/**
 * <p><b>类名:</b> User.java</p>
 * <p><b>标题:</b> </p>
 * <p>描述: </p>
 * <p>作者: <font color='blue'>Edison</font></p>
 * <p>时间: 2018年10月31日 17点17分</p>
 * <p>
 * 桃之夭夭,灼灼其华
 */
public class User implements Serializable{

    private Long id;

    private String userName;

    private String passWord;

    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
