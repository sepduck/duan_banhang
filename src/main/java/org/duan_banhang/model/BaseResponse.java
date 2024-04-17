package org.duan_banhang.model;

import org.springframework.http.ResponseEntity;

public class BaseResponse {
    protected ResponseEntity<?> getResponseEntity(Object data){
        return ResponseEntity.ok().body(myResponse(data));
    }
    public MyResponse myResponse (Object data){
        MyResponse myResponse = new MyResponse();
        myResponse.data = data;
        myResponse.status = 200;
        myResponse.message = "success";
        return myResponse;
    }
}
