package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {

    public ResultSet genarateNewaid() throws SQLException, ClassNotFoundException ;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;

    public void updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;


    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;


    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;



}
