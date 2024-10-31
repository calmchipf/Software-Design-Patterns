package architectural.LoginMVP;

import java.util.Scanner;

public class ConsoleLoginView implements LoginView {
    private final LoginPresenter presenter;
    private Scanner sc = new Scanner(System.in);

    public ConsoleLoginView() {
        this.presenter = new LoginPresenter(this);
    }

    public void showLoginForm() {
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();
        presenter.onLoginClicked(username, password);
    }

    @Override
    public void showLoginSuccess() {
        System.out.println("Login Successful!");
    }

    @Override
    public void showLoginError() {
        System.out.println("Login Failed. Please enter valid credentials.");
    }
}


