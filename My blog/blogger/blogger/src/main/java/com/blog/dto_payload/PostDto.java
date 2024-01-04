package com.blog.dto_payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public final class PostDto {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




    @NotEmpty @Size(min = 2, message = "Title should be at least 2 character")
    private String title;

    @NotEmpty @Size(min = 4, message = "Description should be 4 character")
    private String description;

    @NotEmpty @Size(min = 4, message = "Content should be 4 character")
    private String content;


}


