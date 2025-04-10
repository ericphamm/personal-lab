package eric.pham.springblog.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ArticleDTO {
    @NotBlank(message = "Vyplnte titulek")
    @Size(max = 100, message = "Titulek je prilis dlouhy")
    private String title;

    @NotBlank(message = "Vyplnte popisek")
    private String description;

    @NotBlank(message = "Vyplnte obsah")
    private String content;

    //getter and setter

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
}
