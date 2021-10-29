package cloud.bearbiscuit.DancePlace.commonUtils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.00
 * @Author BearBiscuit
 * @Date 2021-05-04
 * @Description
 */
@Data
public class ResultReturn {
    //是否成功
    private Boolean success;

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private Map<String, Object> data = new HashMap<String, Object>();

    private ResultReturn(){}

    public static ResultReturn ok(){
        ResultReturn r = new ResultReturn();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static ResultReturn error(){
        ResultReturn r = new ResultReturn();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public ResultReturn success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public ResultReturn message(String message){
        this.setMessage(message);
        return this;
    }

    public ResultReturn code(Integer code){
        this.setCode(code);
        return this;
    }

    public ResultReturn data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ResultReturn data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}

