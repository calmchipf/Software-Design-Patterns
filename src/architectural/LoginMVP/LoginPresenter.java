package architectural.LoginMVP;

public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void onLoginClicked(String username, String password) {
        UserModel user = new UserModel(username, password);
        if (user.isValid()) {
            view.showLoginSuccess();
        } else {
            view.showLoginError();
        }
    }
}


