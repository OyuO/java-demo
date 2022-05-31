package org.zy.postgis.model;

import lombok.Data;
import net.postgis.jdbc.PGgeometry;

import java.util.UUID;

@Data
public class ResultDTO {
    private UUID id;

    private PGgeometry point;
}
