package com.example.resource.dto;

/**
 * @author xuan
 * @create 2018-10-19 22:27
 **/
public class InstanceDTO {


    private String serviceId;

    private String host;

    private int port;

    // 保留默认构造函数，防止feign反序列化失败
    public InstanceDTO() {

    }

    public InstanceDTO(String serviceId, String host, int port) {
        this.serviceId = serviceId;
        this.host = host;
        this.port = port;
    }


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


    public String toString() {

        return "Instance serviceId is " + this.serviceId +
                ", host is " + this.host +
                ", port is " + this.port;


    }
}
