package com.xx.gmall.ums.service.impl;

import com.xx.gmall.ums.bean.Member;
import com.xx.gmall.ums.mapper.MemberMapper;
import com.xx.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author xx
 * @since 2019-05-09
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
