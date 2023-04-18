package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;

import java.util.List;

public class OracleDao implements MyDao<String, UserDTO> {
    @Override
    public void insert(UserDTO userDTO) {
        System.out.println("inserted oracle : " + userDTO);
    }

    @Override
    public void delete(String K) {
        System.out.println("deleted Oracle" + K);
    }

    @Override
    public UserDTO select(String s) {
        return null;
    }

    @Override
    public List<UserDTO> select() {
        return null;
    }
}
