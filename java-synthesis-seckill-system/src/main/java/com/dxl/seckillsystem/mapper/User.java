package com.dxl.seckillsystem.mapper;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    /**
     * 注意：
     * 1. 一定要是public修饰
     * 2. 返回值一定要跟源方法一致，包含源方法参数（顺序也要一致）
     * 3. 可以在参数中加BlockException异常处理，可以区分是什么类型的规则，对症下药。
     * @param id
     * @param e
     * @return com.xiexie.sentinel.Entry.User
     */
    public static User blockHandlerForGetUser(String id, BlockException e) {
        e.printStackTrace();
        return new User("被流控");
    }

}
