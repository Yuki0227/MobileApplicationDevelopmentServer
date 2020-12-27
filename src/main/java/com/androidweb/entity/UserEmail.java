
package com.androidweb.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserEmail {
    @Id
    private int id;
    private String email_address;
    private String password;
    private String nickname;
    private String smtp_address;
    private String smtp_port;
    private boolean smtp_encrypt;
    private String imap_address;
    private String imap_port;
    private boolean imap_encrypt;

}
