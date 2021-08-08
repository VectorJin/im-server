package org.jinku.im.application.ao;

import lombok.Data;

@Data
public class ResultAo {
    private Object data;
    private String code;
    private String msg;

    public static ResultAo success() {
        ResultAo resultAo = new ResultAo();
        resultAo.setCode("0");
        resultAo.setMsg("success");
        return resultAo;
    }

    public static ResultAo success(Object data) {
        ResultAo resultAo = new ResultAo();
        resultAo.setData(data);
        resultAo.setCode("0");
        resultAo.setMsg("success");
        return resultAo;
    }
}
