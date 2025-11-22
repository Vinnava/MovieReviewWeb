package dev.vinnava.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private String id;
    private String body;
}
