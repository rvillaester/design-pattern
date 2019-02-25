package com.behavioral.test;

import com.behavioral.template.DatabaseService;
import com.behavioral.template.MySqlDatabaseService;
import com.behavioral.template.OracleDatabaseService;
import com.behavioral.template.SybaseDatabaseService;
import org.junit.Test;

public class TemplateTest {

    @Test
    public void canUseTemplateToRunQuery(){
        DatabaseService service = new MySqlDatabaseService();
        String result = service.runQuery("SELECT * FROM TABLE");
        System.out.println(result);

        service = new OracleDatabaseService();
        result = service.runQuery("SELECT * FROM TABLE");
        System.out.println(result);

        service = new SybaseDatabaseService();
        result = service.runQuery("SELECT * FROM TABLE");
        System.out.println(result);
    }
}
