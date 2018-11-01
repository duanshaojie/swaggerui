package cn.duanshaojie.swaggerui.util;

import org.json.simple.JSONObject;

import javax.ws.rs.core.Response;
/**
 * <p><b>类名:</b> ResponseHelper.java</p>
 * <p><b>标题:</b> 返回</p>
 * <p>描述: </p>
 * <p>时间: 2018年10月31日 16点59分</p>
 * <p>
 * 桃之夭夭,灼灼其华
 * @author edison
 */
public class ResponseHelper {
    public static Response buildResponse(Response.Status status, Object entity) {
        Response response = Response.status(status).entity(entity).build();
        response.getHeaders().putSingle("Access-Control-Allow-Origin","*");
        return response;
    }
    public static Response buildErrorResponse(Response.Status status, String errorMessage) {
        JSONObject result = new JSONObject();
        result.put("message",errorMessage);
        Response response = Response.status(status).entity(result).build();
        return response;
    }
}
