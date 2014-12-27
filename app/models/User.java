/**
 * Created by raphael on 14-12-27.
 */
package models;

import play.data.validation.Constraints;
import play.mvc.QueryStringBindable;

import java.util.Map;

import static play.libs.F.*;


public class User {
    /**
     * 用户名
     */
    @Constraints.Required(message = "请输入用户名")
    public String userName;

    /**
     * 密码
     */
    @Constraints.Required(message = "请输入密码")
    public String password;
}
