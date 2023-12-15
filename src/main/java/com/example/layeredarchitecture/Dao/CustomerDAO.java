package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CustomerDAO {




    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public void customerUpdate(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean saveOnCustomer(CustomerDTO customerSave) throws SQLException, ClassNotFoundException ;

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;
}
