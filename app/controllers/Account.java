package controllers;

import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Account.login;

import java.util.HashMap;


/**
 * Created by raphael on 14-12-27.
 */
public class Account extends Controller {

    static HashMap<String, Object> args = new HashMap<>();

    /**
     * 登录页面
     */
    public static Result login() {
        return ok(login.render());
    }

    /**
     * 登录Post
     */
    public static Result postLogin() {
        args.clear();
        DynamicForm data = Form.form().bindFromRequest();

        String email = data.get("name");
        String pwd = data.get("pwd");
        String autoLogin = data.get("remember");

        return redirect("/");
    }
}
