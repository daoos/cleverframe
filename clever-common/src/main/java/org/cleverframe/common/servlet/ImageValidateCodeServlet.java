package org.cleverframe.common.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 图片验证码 HttpServlet<br/>
 * <p/>
 * 作者：LiZW <br/>
 * 创建时间：2016-5-17 11:02 <br/>
 */
public class ImageValidateCodeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * 客户端GET请求，返回图片验证码<br>
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("Pragma", "no-cache");
//        resp.setHeader("Cache-Control", "no-cache");
//        resp.setDateHeader("Expires", 0);
//        resp.setContentType("image/jpeg");
//        String content = ImageValidateCageUtils.createImageStream(resp.getOutputStream());
//        if (StringUtils.isNotBlank(content)) {
//            ValidateCode validateCode = new ValidateCode(System.currentTimeMillis(), content);
//            req.getSession().setAttribute(CommonSessionAttributes.VALIDATE_CODE, validateCode);
//        } else {
//            req.getSession().removeAttribute(CommonSessionAttributes.VALIDATE_CODE);
//            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "生成验证码失败");
//        }
    }

    /**
     * 客户端POST请求<br>
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
