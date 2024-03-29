package com.gambalongasys.database;

import com.gambalongasys.database.model.DatabaseModel;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDadosTest {

    public static List<DatabaseModel> listaDeDatabases() {
            ArrayList<DatabaseModel> dtbModel = new ArrayList<DatabaseModel>();
            dtbModel.add(new DatabaseModel(1L, "LUIZ",null,null));
            dtbModel.add(new DatabaseModel(2L, "HENRIQUE",null,null));
        return dtbModel;
    }

    public static DatabaseModel CriarDatabase() {
        return new DatabaseModel(1L, "PAMELA", "099.520.749-64", null);
    }
    public static DatabaseModel CriarDatabaseComCpfECnpjVazio() {
        DatabaseModel dtb = new DatabaseModel();
        dtb.setId(1L);
        dtb.setNome("PAMELA_TESTE");
        return dtb;
    }

}
