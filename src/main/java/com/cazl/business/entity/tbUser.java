//--------------------------------------------------------------------
// 日期：2019/7/12 13:37
// 人员：mrliz
// 原因：
//--------------------------------------------------------------------

package com.cazl.business.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Table(name = "tb_users")
public class tbUser implements Serializable {
    @Id
    private Integer id;
    private String name;
    private String password;
}
