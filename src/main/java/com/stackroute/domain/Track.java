package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data //Using lombok to handle the getter setters
@NoArgsConstructor //Creates a zero argument constructor
@AllArgsConstructor //Creates an all argument constructor
@Builder
@Document(collection = "track")
public class Track {


    //@GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    int id;
    String name;
    String comment;

  public Track(String comment, String name) {
  }



   /* public Track(int id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
*/

}
