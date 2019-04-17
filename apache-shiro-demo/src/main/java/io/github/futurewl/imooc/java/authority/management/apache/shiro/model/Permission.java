package io.github.futurewl.imooc.java.authority.management.apache.shiro.model;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:50
 * @version 1.0
 */
public class Permission {

    private Integer pid;

    private String name;

    private String url;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
