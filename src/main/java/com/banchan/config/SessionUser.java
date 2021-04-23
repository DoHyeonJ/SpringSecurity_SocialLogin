package com.banchan.config;


import java.io.Serializable;

import com.banchan.domain.user.Account;
import lombok.Getter;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Account account) {
        this.name = account.getName();
        this.email = account.getEmail();
        this.picture = account.getPicture();
    }
}
