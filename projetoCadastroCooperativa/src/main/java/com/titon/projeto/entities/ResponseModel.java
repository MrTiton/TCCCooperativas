package com.titon.projeto.entities;

public class ResponseModel {

    private int codigo;
    private String msg;

    public ResponseModel(int codigo, String msg) {
        this.codigo = codigo;
        this.msg = msg;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}