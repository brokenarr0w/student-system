package com.example.backend.base;

import jakarta.persistence.Column;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 公共Entity
 * @date 2023/10/3 16:21
 */
@Data
public class BaseEntity implements Serializable {
    /**
     * 创建时间
     */
    @Column(name = "create_time",nullable = false)
    @CreationTimestamp
    private Timestamp createTime;
    /**
     * 创建者id
     */
    @Column(name = "create_by")
    private Long createBy;
    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @UpdateTimestamp
    private Timestamp updateTime;
    /**
     * 更新者id
     */
    @Column(name = "update_by")

    private Long updateBy;
    /**
     * 备注
     */
    @Column(name = "remarks")
    private String remarks;

    public @interface Update {}
    //toStringBuilder是因为toString使用时是拿加号将字符串拼接而成，
    // 每次拼接都会new一个String对象 为了避免这种问题使用toStringBuilder
    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        Field[] fields = this.getClass().getDeclaredFields();
        try {
            for (Field f : fields) {
                f.setAccessible(true);
                builder.append(f.getName(), f.get(this)).append("\n");
            }
        } catch (Exception e) {
            builder.append("toString builder encounter an error");
        }
        return builder.toString();
    }
}
