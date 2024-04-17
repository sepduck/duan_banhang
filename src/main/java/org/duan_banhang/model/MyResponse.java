package org.duan_banhang.model;

import lombok.Data;

@Data
public class MyResponse{
    public int status;
    public String message;
    public Object data;
}
