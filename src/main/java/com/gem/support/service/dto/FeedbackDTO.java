package com.gem.support.service.dto;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by vanhop on 3/8/16.
 */
public class FeedbackDTO {

    private String id;
    private UserInfo userInfo;
    private String content;
    private Date time;
    private String appVersion;
    private String osType;
    private String deviceId;
    private String model;
    private String brand;
    private int type;
    private int status;

    public FeedbackDTO() {
    }

    public FeedbackDTO(String id, UserInfo userInfo, String content, Date time, String appVersion, String osType, String deviceId, String model, String brand, int type, int status) {
        this.id = id;
        this.userInfo = userInfo;
        this.content = content;
        this.time = time;
        this.appVersion = appVersion;
        this.osType = osType;
        this.deviceId = deviceId;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class UserInfo {

        String username;
        String avatar;
        String email;
        String company;

        public UserInfo() {
        }

        public UserInfo(String username, String avatar, String email, String company) {
            this.username = username;
            this.avatar = avatar;
            this.email = email;
            this.company = company;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }
    }


}
