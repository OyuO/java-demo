package org.zy.postgis;

import net.postgis.jdbc.PGgeometry;
import net.postgis.jdbc.geometry.Point;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.util.UUID;

public class PostgisJdbcTest {

    @Test
    public void select() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://114.132.245.36:5432/weve";
        var conn = DriverManager.getConnection(url, "postgres", "123456654321");
        var s = conn.createStatement();
        var r = s.executeQuery("select id,position from map.map_upload");
        while (r.next()) {
            var uuid = r.getObject(1, UUID.class);
            var geo = r.getObject(2, PGgeometry.class);
            System.out.println(uuid.toString());
            System.out.println(geo.toString());
        }
        s.close();
        conn.close();
    }

    @Test
    public void insert() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://114.132.245.36:5432/weve";
        var conn = DriverManager.getConnection(url, "postgres", "123456654321");
        var geometry = new PGgeometry(new Point(-71.064545, 42.287868));

        var ptmt = conn.prepareStatement("insert into test.gis(point) values (?)");
        ptmt.setObject(1, geometry);
        ptmt.execute();
    }

    @Test
    public void testfdsf() {
        float[] array = {1.1f, 1.2f};
    }

}
