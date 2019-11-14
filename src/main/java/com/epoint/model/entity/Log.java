package com.epoint.model.entity;

import com.epoint.model.enums.LogType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "logs")
@NoArgsConstructor
@ToString
public class Log extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Log key.
     */
    @Column(name = "log_key")
    private String logKey;

    /**
     * Log type.
     */
    @Column(name = "type")
    private LogType type;

    /**
     * Log content.
     */
    @Column(name = "content")
    private String content;

    /**
     * Operator's ip address.
     */
    @Column(name = "ip_address")
    private String ipAddress;


    public Log(int id) {
        this.id = id;
    }


}
