package io.github.futurewl.imooc.java.authority.management.apache.shiro.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:50
 * @version 1.0
 */
public class Role {

    private Integer rid;

    private String name;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> users = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
