package com.mingcode.mapper;

import java.util.List;

import com.mingcode.pojo.Users;
import com.mingcode.pojo.vo.FriendRequestVO;
import com.mingcode.pojo.vo.MyFriendsVO;

public interface UsersMapperCustom extends tk.mybatis.mapper.common.Mapper<Users>, tk.mybatis.mapper.common.MySqlMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}