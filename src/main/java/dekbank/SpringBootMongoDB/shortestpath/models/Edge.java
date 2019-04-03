package dekbank.SpringBootMongoDB.shortestpath.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Edge {

    private String to;
    private String from;
    private Integer distance;
    private Integer cost;

}
