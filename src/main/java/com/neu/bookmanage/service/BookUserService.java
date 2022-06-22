package com.neu.bookmanage.service;

import com.neu.bookmanage.entity.Bookuser;
import org.apache.ibatis.annotations.Param;

public interface BookUserService {
    Bookuser login( String username , String password);
}
