package com.msr.ucenter.mapper;

import com.msr.ucenter.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-06-12
 */
public interface MemberMapper extends BaseMapper<Member> {
    Integer selectRegisterCount(String day);

}
