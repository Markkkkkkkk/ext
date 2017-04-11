package pri.Mark.ext.model;

public class User {
    private Integer userId;

    private String userSaltpassword;

    private Integer userRole;

    private Integer userLog;

    private String userSalt;

    private String userLogintoken;

    private String userAlterpasswordtoken;

    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserSaltpassword() {
        return userSaltpassword;
    }

    public void setUserSaltpassword(String userSaltpassword) {
        this.userSaltpassword = userSaltpassword == null ? null : userSaltpassword.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserLog() {
        return userLog;
    }

    public void setUserLog(Integer userLog) {
        this.userLog = userLog;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    public String getUserLogintoken() {
        return userLogintoken;
    }

    public void setUserLogintoken(String userLogintoken) {
        this.userLogintoken = userLogintoken == null ? null : userLogintoken.trim();
    }

    public String getUserAlterpasswordtoken() {
        return userAlterpasswordtoken;
    }

    public void setUserAlterpasswordtoken(String userAlterpasswordtoken) {
        this.userAlterpasswordtoken = userAlterpasswordtoken == null ? null : userAlterpasswordtoken.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}