package com.baomidou.ant.sys.service.impl;

import com.baomidou.ant.sys.entity.UserInfo;
import com.baomidou.ant.sys.mapper.UserInfoMapper;
import com.baomidou.ant.sys.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-08
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
