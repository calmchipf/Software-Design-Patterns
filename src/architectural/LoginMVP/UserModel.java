package architectural.LoginMVP;

public class UserModel {
    private String username;
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }
}

